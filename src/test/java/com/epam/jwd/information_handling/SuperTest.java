package com.epam.jwd.information_handling;

import com.epam.jwd.information_handling.domain.BaseTextComponent;
import com.epam.jwd.information_handling.domain.EntireText;
import com.epam.jwd.information_handling.util.TextReaderUtil;
import org.junit.Test;

public class SuperTest {
    @Test
    public void test() {
        String str = "Hello nick. How's are u?\nFine.";
        str = TextReaderUtil.read("src/main/resources/text.txt");
        BaseTextComponent root = new EntireText();
        root.setValue(str);
        root.add(root);
        //System.out.println(root.getComposite().get(0).getComposite().get(1).getComposite().size());
        System.out.println(root.build());
    }
}
