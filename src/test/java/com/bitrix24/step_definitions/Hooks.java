package com.bitrix24.step_definitions;

import com.bitrix24.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
