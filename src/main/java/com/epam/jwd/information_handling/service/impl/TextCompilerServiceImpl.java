package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.interpreter.BitwiseLogicalExpression;
import com.epam.jwd.information_handling.service.TextCompilerService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCompilerServiceImpl implements TextCompilerService {
    private static final String EXPRESSION_REGEX = "(((<{2}|>{2})|[&~^)(|])|(\\d+))+";

    @Override
    public String compile(String text) {
        String expression = "";
        Pattern pattern = Pattern.compile(EXPRESSION_REGEX);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            expression = matcher.group();
        }
        if (expression.length() > 1 && !expression.equals("()")) {
            return text.replaceFirst(EXPRESSION_REGEX, new BitwiseLogicalExpression(expression).calculate().toString());
        }
        return text;
    }
}
