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
                .setNext(ConcreteTextSplitter.LEXEME));
    }

    @Test
    void handleTest() {

    }
}
