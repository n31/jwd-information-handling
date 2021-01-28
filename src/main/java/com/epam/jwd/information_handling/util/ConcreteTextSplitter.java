package com.epam.jwd.information_handling.util;

public enum ConcreteTextSplitter implements TextSplitter {
    PARAGRAPH("h"),
    SENTENCE("h"),
    LEXEME("j"),
    WORD("d"),
    EXPRESSION("d"),
    SYMBOL("d");

    String regex;
    TextSplitter next;

    ConcreteTextSplitter(String regex) {
        this.regex = regex;
    }

    @Override
    public void setNext(TextSplitter textSplitter) {
        this.next = textSplitter;
    }

    public String getRegex() {
        return regex;
    }

    @Override
    public void handle(String text) {

    }
}
