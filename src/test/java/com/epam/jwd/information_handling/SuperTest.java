package com.epam.jwd.information_handling;

import com.epam.jwd.information_handling.interpreter.Client;
import com.epam.jwd.information_handling.interpreter.ReversePolishNotation;
import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Test;

public class SuperTest {
    @Test
    public void test() { // 2 | (5 >> 2)
        String expression = "2|5>>2";
        ReversePolishNotation rpn = new ReversePolishNotation();
        Client interpreter = new Client(rpn.convert(expression));
        System.out.println(interpreter.calculate());
        System.out.println(2|5>>2);
        System.out.println(rpn.convert(expression));
    }
}
