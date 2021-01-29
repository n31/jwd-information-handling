package com.epam.jwd.information_handling.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ConcreteTextSplitter implements TextSplitter {
    PARAGRAPH(ENTIRE_TEXT_REGEX, PARAGRAPH_REGEX),
    SENTENCE(ENTIRE_PARAGRAPH_REGEX, SENTENCE_REGEX),
    LEXEME(ENTIRE_SENTENCE_REGEX, LEXEME_REGEX),
    WORD(ENTIRE_LEXEME_REGEX, WORD_REGEX),
    SYMBOL("", SYMBOL_REGEX);



    private String regexFullMatch;
    private String regexSplitMatch;
    private TextSplitter next;
    private Pattern pattern;

    ConcreteTextSplitter(String regexFullMatch, String regexSplitMatch) {
        this.regexFullMatch = regexFullMatch;
        this.regexSplitMatch = regexSplitMatch;
        this.pattern = Pattern.compile(regexFullMatch);
    }

    @Override
    public TextSplitter setNext(TextSplitter textSplitter) {
        this.next = textSplitter;
        return this;
    }

    public String getRegexFullMatch() {
        return regexFullMatch;
    }

    @Override
    public List<String> handle(String text) {
        Matcher matcher = pattern.matcher(text);
        List<String> textComponents = new ArrayList<>();
        if (matcher.matches()) {
            while(matcher.find()) {
                textComponents.add(matcher.group());
            }
        } else {
            if (next != null) {
                next.handle(text);
            } else {
                return null;
            }
        }
        return textComponents;
    }
}
