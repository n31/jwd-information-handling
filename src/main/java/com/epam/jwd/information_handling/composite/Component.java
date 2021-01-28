package com.epam.jwd.information_handling.composite;

import com.epam.jwd.information_handling.domain.TextEntity;

import java.util.Optional;

public interface Component extends TextEntity{
    void operation();
    void add(Component component);
    void remove(Component component);
    Optional<Component> getChild(int index);
}
