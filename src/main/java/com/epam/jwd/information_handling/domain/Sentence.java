package com.epam.jwd.information_handling.domain;

public class Sentence extends BaseTextComponent {
    private char endSign;

    @Override
    public String build() {
        StringBuilder text = new StringBuilder();
        composite.forEach(e -> {
            text.append(e.build());
            text.append(" ");
        });
        text.deleteCharAt(text.length()-1);
        text.append(endSign);
        return text.toString().substring(0, 1).toUpperCase() + text.toString().substring(1);
    }

    @Override
    public void setEndSign(char endSign) {
        this.endSign = endSign;
    }
}
