package com.epam.jwd.information_handling.domain;

public class EntireText extends BaseTextComponent {
    @Override
    public String build() {
        StringBuilder text = new StringBuilder();
        composite.forEach(e -> {
            text.append("\t");
            text.append(e.build());
            text.append(System.lineSeparator());
        });
        return text.substring(0, text.length() - System.lineSeparator().length());
    }
}
