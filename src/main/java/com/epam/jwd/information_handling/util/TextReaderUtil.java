package com.epam.jwd.information_handling.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextReaderUtil {
    private static final Logger logger = LogManager.getLogger(TextReaderUtil.class);

    static String read(String filePath) {
        File file = new File(filePath);
        byte[] data = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(data);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return new String(data, StandardCharsets.UTF_8);
    }
}
