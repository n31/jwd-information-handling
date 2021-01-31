package com.epam.jwd.information_handling.domain;

import com.epam.jwd.information_handling.service.TextCompilerService;
import com.epam.jwd.information_handling.service.impl.TextCompilerServiceImpl;

public class Lexeme extends BaseTextComponent {
    private final TextCompilerService compiler = new TextCompilerServiceImpl();

    @Override
    public String build() {
        return compiler.compile(getValue());
    }
}
