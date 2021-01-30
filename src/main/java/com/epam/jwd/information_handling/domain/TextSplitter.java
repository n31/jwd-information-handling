package com.epam.jwd.information_handling.domain;

import java.util.List;

public interface TextSplitter {
    //todo: read about constants in interfaces
    static final String PARAGRAPH_REGEX = ".+(\\n)?";
    static final String SENTENCE_REGEX = "[A-Z].*?[\\.\\!\\?]";
    static final String LEXEME_REGEX = "\\S+";

    TextSplitter setNext(TextSplitter textSplitter);
    void handle(TextComponent textComponent, List<TextComponent> composite);
}
