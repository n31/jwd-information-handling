package com.epam.jwd.information_handling.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class ReversePolishNotationTest {
    ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

    @Test
    public void convertTest1() {
        String expression = "~6&91|(3&4)";
        String expected = "6 ~ 91 & 3 4 & |";
        String actual = reversePolishNotation.convert(expression);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest2() {
        String expression = "5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1)";
        String expected = "5 1 2 3 4 2 5 ^ 6 47 & | & 3 | 2 | | & & 1 | |";
        String actual = reversePolishNotation.convert(expression);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest3() {
        String expression = "(~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78";
        String expected = "71 ~ 2 3 & 3 2 1 2 >> & 2 | 2 & | 10 2 & | | & 78 |";
        String actual = reversePolishNotation.convert(expression);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest4() {
        String expression = "(2^5|1&2<<(2|5>>2&71))|1200";
        String expected = "2 5 ^ 1 2 2 5 2 >> | 71 & << & | 1200 |";
        String actual = reversePolishNotation.convert(expression);
        Assert.assertEquals(expected, actual);
    }
}

