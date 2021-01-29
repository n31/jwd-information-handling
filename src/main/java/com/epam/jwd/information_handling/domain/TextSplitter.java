package com.epam.jwd.information_handling.domain;

import java.util.List;

public interface TextSplitter {
    static final String ENTIRE_WORD_REGEX = "[\\w\\'\\-]+";
    static final String ENTIRE_LEXEME_REGEX = "[[A-Z]|\\s].*";
    static final String ENTIRE_SENTENCE_REGEX = "[A-Z][^[\\\\.\\\\!\\\\?]]*";
    static final String ENTIRE_PARAGRAPH_REGEX = "[A-Z].*\\.";
    static final String ENTIRE_TEXT_REGEX = "(?s)\\s{4}.+\\.";

    static final String PARAGRAPH_REGEX = ".+(\\n)?";
    static final String SENTENCE_REGEX = "[A-Z].*?[\\.\\!\\?]";
    static final String LEXEME_REGEX = "\\S";
    static final String WORD_REGEX = "[\\w\\'\\-]";
    static final String SYMBOL_REGEX = "\\w";

    TextSplitter setNext(TextSplitter textSplitter);
    List<String> handle(String text);
}
