package com.bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue="com/bitrix24/StepDefinitions",
        dryRun = false,
        tags= "@bitrix_download_client"



)

public class CukesRunner {
  

}