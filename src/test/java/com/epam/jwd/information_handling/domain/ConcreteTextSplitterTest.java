package com.epam.jwd.information_handling.domain;

import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTextSplitterTest {
    private String textFromFile;
    private TextSplitter textSplitter;

    @Before
    void setup() {
        textFromFile = TextReaderUtil.read("src/main/resources/text.txt");
        textSplitter = ConcreteTextSplitter.PARAGRAPH
                .setNext(ConcreteTextSplitter.SENTENCE
                .setNext(ConcreteTextSplitter.LEXEME
                .setNext(ConcreteTextSplitter.WORD
                .setNext(ConcreteTextSplitter.SYMBOL))));
    }

    @Test
    void handleTest() {
        List<String> expectedVal = new ArrayList<>();
        expectedVal.add("Hello! How are you doing?");
        expectedVal.add("I'm fine, thanks. How about you?");
        expectedVal.add("Same here. Have a great day!");
        expectedVal.add("Thanks!");
        List<String> actualVal = textSplitter.handle(textFromFile);
        Assert.assertEquals(expectedVal, actualVal);
    }
}
