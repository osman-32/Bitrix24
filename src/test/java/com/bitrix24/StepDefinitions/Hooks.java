package com.bitrix24.StepDefinitions;

import com.bitrix24.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    @Before
    public void setUp() {
        Driver.getDriver().manage().window().maximize();
    }


    @Before
    public void setUpScenario(){
        System.out.println("---> Before annotation : Setting up browser");
    }
    @Before
    public  void setUpDatabaseConnection(){
        System.out.println("---->Before Annotation:DB connection created<---------");
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //2 we are going to attach it into our report
            //attach method accept 3 arguments screenshot,"image/png" and current scenario's name
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }


   // @After
    //public void tearDown(){
      //  Driver.getDriver().close();

   // }

}
