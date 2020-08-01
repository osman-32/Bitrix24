package com.bitrix24.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin   = "html:target/cucumber-report.html",//creates report
        features = "src/test/resources/features",     //features content root
        glue     = "com/bitrix24/StepDefinitions",   //glue source root
        dryRun   = false,
        tags     = "@bitrix_download_client"
)

public class DownloadDesktopClientRunner {
}
