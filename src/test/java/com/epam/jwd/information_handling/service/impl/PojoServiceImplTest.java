package com.epam.jwd.information_handling.service.impl;

import com.epam.jwd.information_handling.domain.Pojo;
import com.epam.jwd.information_handling.service.PojoService;
import org.junit.Before;
import org.junit.Test;

public class PojoServiceImplTest {
    Pojo pojo;
    PojoService pojoService;

    @Before
    public void setup() {
        pojo = new Pojo("Jane Doe");
        pojoService = new PojoServiceImpl();
    }

    @Test
    public void logNameTest() {
        pojoService.logName(pojo);
    }
}
