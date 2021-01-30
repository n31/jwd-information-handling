package com.epam.jwd.information_handling.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SentenceTest {
    @Test
    public void buildTest() {
        List<TextComponent> lexemes = new ArrayList<>();
        TextComponent lexeme1 = new Lexeme();
        lexeme1.setValue("Cats");
        TextComponent lexeme2 = new Lexeme();
        lexeme1.setValue("is");
        TextComponent lexeme3 = new Lexeme();
        lexeme1.setValue("good");

        TextComponent sentence = new Sentence();
       // sentence.add()


    }
}
