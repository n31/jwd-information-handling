package com.epam.jwd.information_handling.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseLogicalExpressionTest {
    @Test
    public void calculateTest1() {
        String expression = "~6&9|(3&4)";
        Number expected = ~6&9|(3&4);
        Number actual = new BitwiseLogicalExpression(expression).calculate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateTest2() {
        String expression = "(((5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1))))";
        Number expected = 5|(1&2&(3|(4&(2^5|6&47)|3)|2)|1);
        Number actual = new BitwiseLogicalExpression(expression).calculate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateTest3() {
        String expression = "(~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78";
        Number expected = (~71&(2&3|(3|(2&1>>2|2)&2)|10&2))|78;
        Number actual = new BitwiseLogicalExpression(expression).calculate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateTest4() {
        String expression = "(2^5|1&2<<(2|5>>2&71))|1200";
        Number expected = (2^5|1&2<<(2|5>>2&71))|1200;
        Number actual = new BitwiseLogicalExpression(expression).calculate();
        Assert.assertEquals(expected, actual);
    }
}
