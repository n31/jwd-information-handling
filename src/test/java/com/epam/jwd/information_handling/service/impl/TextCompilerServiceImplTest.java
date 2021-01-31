package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.service.TextCompilerService;
import org.junit.Assert;
import org.junit.Test;

public class TextCompilerServiceImplTest {
    @Test
    public void compileTest() {
        TextCompilerService compiler = new TextCompilerServiceImpl();
        String text = "~6&9|(3&4),";
        String actual = compiler.compile(text);
        String expected = "9,";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compileTest1() {
        TextCompilerService compiler = new TextCompilerServiceImpl();
        String text = "),";
        String actual = compiler.compile(text);
        String expected = "),";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compileTest2() {
        TextCompilerService compiler = new TextCompilerServiceImpl();
        String text = "(),";
        String actual = compiler.compile(text);
        String expected = "(),";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compileTest3() {
        TextCompilerService compiler = new TextCompilerServiceImpl();
        String text = "hello,";
        String actual = compiler.compile(text);
        String expected = "hello,";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void compileTest4() {
        TextCompilerService compiler = new TextCompilerServiceImpl();
        String text = "";
        String actual = compiler.compile(text);
        String expected = "";
        Assert.assertEquals(expected, actual);
    }
}
