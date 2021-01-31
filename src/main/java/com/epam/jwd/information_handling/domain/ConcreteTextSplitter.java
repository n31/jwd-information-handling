package com.epam.jwd.information_handling.domain;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ConcreteTextSplitter implements TextSplitter {
    PARAGRAPH(PARAGRAPH_REGEX, EntireText.class.getSimpleName()),
    SENTENCE(SENTENCE_REGEX, Paragraph.class.getSimpleName()),
    LEXEME(LEXEME_REGEX, Sentence.class.getSimpleName());

    private final String handleClass;
    private TextSplitter next;
    private final Pattern pattern;

    ConcreteTextSplitter(String regex, String handleClass) {
        this.handleClass = handleClass;
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public TextSplitter setNext(TextSplitter textSplitter) {
        this.next = textSplitter;
        return this;
    }

    @Override
    public void handle(TextComponent textComponent, List<TextComponent> composite) {
        if (textComponent.getClass().getSimpleName().equals(handleClass)) {
            Matcher matcher = pattern.matcher(textComponent.getValue());
            while(matcher.find()) {
                int order = ordinal();
                TextComponent derivedComponent;
                switch(order) {
                    case 0: {
                        derivedComponent = new Paragraph();
                        derivedComponent.setValue(matcher.group().trim());
                    }
                    break;
                    case 1: {
                        derivedComponent = new Sentence();
                        StringBuilder text = new StringBuilder(matcher.group().trim());
                        derivedComponent.setEndSign(text.charAt(text.length()-1));
                        text.deleteCharAt(text.length() - 1);
                        derivedComponent.setValue(text.toString());
                    }
                    break;
                    case 2: {
                        derivedComponent = new Lexeme();
                        derivedComponent.setValue(matcher.group().trim());
                    }
                    break;
                    default: derivedComponent = new EntireText();
                }
                derivedComponent.add(derivedComponent);
                composite.add(derivedComponent);
            }
        } else {
            if (next != null) {
                next.handle(textComponent, composite);
            }
        }
    }
}
