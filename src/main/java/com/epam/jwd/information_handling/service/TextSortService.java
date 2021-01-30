package com.epam.jwd.information_handling.service;

import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.domain.Paragraph;
import com.epam.jwd.information_handling.domain.Sentence;
import com.epam.jwd.information_handling.domain.TextComponent;

public interface TextSortService {
    void sortParagraphsBySentences(TextComponent entireText);
    void sortSentencesByLexemes(TextComponent paragraph);
    void sortLexemesBySymbolEntrance(TextComponent sentence, char symbol);
}
