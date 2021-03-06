package com.epam.jwd.information_handling.domain;

public class Paragraph extends BaseTextComponent {
    @Override
    public String build() {
        StringBuilder text = new StringBuilder();
        composite.forEach(e -> {
            text.append(e.build());
            text.append(" ");
        });
        return text.toString().trim();
    }
}
