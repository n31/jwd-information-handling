package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.domain.TextComponent;
import com.epam.jwd.information_handling.service.TextSortService;
import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Assert;
import org.junit.Test;

public class TextSortServiceImplTest {
    private final TextSortService sorter = new TextSortServiceImpl();
    private TextComponent text = new EntireText();

    @Test
    public void sortParagraphsBySentencesTest() {
        text.setValue(TextReaderUtil.read("src/main/resources/text.txt"));
        text.add(text);
        String expected = TextReaderUtil.read("src/main/resources/paragraph_sort_expected.txt");
        sorter.sortParagraphsBySentences(text);
        String actual = text.build();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortSentencesByLexemes() {
        text.setValue(TextReaderUtil.read("src/main/resources/text.txt"));
        text.add(text);
        String expected = TextReaderUtil.read("src/main/resources/sentence_sort_expected.txt");
        sorter.sortSentencesByLexemes(text);
        String actual = text.build();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortLexemesByEntranceSymbol() {
        text.setValue(TextReaderUtil.read("src/main/resources/text.txt"));
        text.add(text);
        String expected = TextReaderUtil.read("src/main/resources/lexeme_sort_expected.txt");
        sorter.sortLexemesBySymbolEntrance(text, 'o');
        String actual = text.build();
        Assert.assertEquals(expected, actual);
    }
}
