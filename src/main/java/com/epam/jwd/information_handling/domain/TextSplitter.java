package com.epam.jwd.information_handling.domain;

import java.util.List;

public interface TextSplitter {
    String PARAGRAPH_REGEX = ".+(\\n)?";
    String SENTENCE_REGEX = "[A-Z].*?[\\.\\!\\?]";
    String LEXEME_REGEX = "\\S+";

    TextSplitter setNext(TextSplitter textSplitter);
    void handle(TextComponent textComponent, List<TextComponent> composite);
}
