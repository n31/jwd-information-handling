package com.epam.jwd.information_handling.domain;

import org.junit.Assert;
import org.junit.Test;

public class LexemeTest {
    @Test
    public void buildTest() {
        TextComponent lexeme = new Lexeme();
        lexeme.setValue("cat");
        String expected = "cat";
        String actual = lexeme.build();
        Assert.assertEquals(expected, actual);
    }
}
