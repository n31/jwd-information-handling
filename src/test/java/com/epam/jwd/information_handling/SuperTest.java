package com.epam.jwd.information_handling;

import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.domain.TextComponent;
import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Test;

public class SuperTest {
    @Test
    public void test() {
        String str = TextReaderUtil.read("src/main/resources/text.txt");
        TextComponent root = new EntireText();
        root.setValue(str);
        root.add(root);
        System.out.println(root.build());
    }
}
