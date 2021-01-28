package com.epam.jwd.information_handling.composite;

import com.epam.jwd.information_handling.domain.TextEntity;

import java.util.Optional;

public class Leaf implements Component{
    @Override
    public void operation() {

    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public Optional<Component> getChild(int index) {
        return Optional.empty();
    }

    @Override
    public String getValue() {
        return null;
    }
}
