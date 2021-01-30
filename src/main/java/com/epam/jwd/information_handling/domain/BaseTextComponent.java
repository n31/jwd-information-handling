package com.epam.jwd.information_handling.domain;

import java.util.ArrayList;
import java.util.List;

abstract public class BaseTextComponent implements TextComponent {
    protected String value;
    protected List<TextComponent> composite = new ArrayList<>();

    @Override
    public void add(TextComponent textComponent) {
        TextSplitter textSplitter = ConcreteTextSplitter.PARAGRAPH
                .setNext(ConcreteTextSplitter.SENTENCE
                        .setNext(ConcreteTextSplitter.LEXEME));
        textSplitter.handle(textComponent, composite);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public List<TextComponent> getComposite() {
        return composite;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void setEndSign(char endSign) {

    }
}
