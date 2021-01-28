package com.epam.jwd.information_handling.composite;

import com.epam.jwd.information_handling.domain.TextEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Composite implements Component {
    List<Component> components = new ArrayList<>();

    @Override
    public void operation() {

    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public Optional<Component> getChild(int index) {
        return Optional.of(components.get(index));
    }


    @Override
    public String getValue() {
        return null;
    }
}
