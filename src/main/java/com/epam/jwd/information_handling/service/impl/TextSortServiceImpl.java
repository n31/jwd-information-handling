package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.comparator.LexemeComparator;
import com.epam.jwd.information_handling.comparator.ParagraphComparator;
import com.epam.jwd.information_handling.comparator.SentenceComparator;
import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.domain.Paragraph;
import com.epam.jwd.information_handling.domain.Sentence;
import com.epam.jwd.information_handling.domain.TextComponent;
import com.epam.jwd.information_handling.service.TextSortService;
import org.w3c.dom.Text;

import java.util.Comparator;

public class TextSortServiceImpl implements TextSortService {
    private final Comparator<TextComponent> PARAGRAPH_COMPARATOR = new ParagraphComparator();
    private final Comparator<TextComponent> SENTENCE_COMPARATOR = new SentenceComparator();
    private LexemeComparator lexemeComparator = new LexemeComparator();

    @Override
    public void sortParagraphsBySentences(TextComponent entireText) {
        entireText.getComposite().sort(PARAGRAPH_COMPARATOR);
    }

    @Override
    public void sortSentencesByLexemes(TextComponent entireText) {
        entireText.getComposite().forEach(paragraph -> {
            paragraph.getComposite().sort(SENTENCE_COMPARATOR);
        });
    }

    @Override
    public void sortLexemesBySymbolEntrance(TextComponent entireText, char symbol) {
        lexemeComparator.setSymbol(symbol);
        entireText.getComposite().forEach(paragraph -> {
            paragraph.getComposite().forEach(sentence -> {
                sentence.getComposite().sort(lexemeComparator);
            });
        });
    }
}
