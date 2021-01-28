package com.epam.jwd.information_handling.util;

public interface TextSplitter {
    void setNext(TextSplitter textSplitter);
    void handle(String text);
}
