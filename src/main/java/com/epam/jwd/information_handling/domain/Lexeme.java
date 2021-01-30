package com.epam.jwd.information_handling.domain;

public class Lexeme extends BaseTextComponent {
    @Override
    public String build() {
        return getValue();
    }
}
