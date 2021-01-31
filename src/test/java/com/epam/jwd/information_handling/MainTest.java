package com.epam.jwd.information_handling;

import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.domain.TextComponent;
import com.epam.jwd.information_handling.service.TextSortService;
import com.epam.jwd.information_handling.service.impl.TextSortServiceImpl;
import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Test;

public class MainTest {
    @Test
    public void test() {
        String text = TextReaderUtil.read("src/main/resources/text.txt");
        System.out.println("Text from file: ");
        System.out.println(text);

        TextComponent root = new EntireText();
        root.setValue(text);
        root.add(root);
        System.out.println("\nOriginal text with calculated expressions: ");
        System.out.println(root.build());

        TextSortService sorter = new TextSortServiceImpl();

        System.out.println("\nSorted by paragraphs text ascend: ");
        sorter.sortParagraphsBySentences(root);
        System.out.println(root.build());

        System.out.println("\nSorted by sentences text ascend: ");
        sorter.sortSentencesByLexemes(root);
        System.out.println(root.build());

        System.out.println("\nSorted by lexemes text (by the count of entries of the letter 'o') ascend:");
        sorter.sortLexemesBySymbolEntrance(root, 'o');
        System.out.println(root.build());
    }
}
