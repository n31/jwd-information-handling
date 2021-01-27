package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.domain.Pojo;
import com.epam.jwd.information_handling.service.PojoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PojoServiceImpl implements PojoService {
    private static final Logger logger = LogManager.getLogger(PojoServiceImpl.class);

    public void logName(Pojo pojo) {
        logger.info(pojo.getName());
    }
}
