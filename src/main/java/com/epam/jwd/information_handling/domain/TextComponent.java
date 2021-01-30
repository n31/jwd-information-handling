package com.epam.jwd.information_handling.domain;

import java.util.List;

public interface TextComponent {
    void add(TextComponent textComponent);
    String build();
    String getValue();
    void setValue(String value);
    void setEndSign(char endSign);
    List<TextComponent> getComposite();
}
