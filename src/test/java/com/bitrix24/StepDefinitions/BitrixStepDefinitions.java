package com.bitrix24.StepDefinitions;

import com.bitrix24.pages.ActionsPage;
import com.bitrix24.pages.LandingPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BitrixStepDefinitions {

    LandingPage landingPage = new LandingPage();

    LoginPage loginPage = new LoginPage();

    ActionsPage actionsPage = new ActionsPage();

    @When("User clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("hr_username2"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("bitrix_password"));

        loginPage.loginButton.click();

    }

    @Then("User uploads files and pictures from local disks")
    public void user_uploads_files_and_pictures_from_local_disks() throws Exception {

        actionsPage.moreButton.click();
        Thread.sleep(2000);
        actionsPage.fileButton.click();
        Thread.sleep(2000);
        actionsPage.uploadButton.click();


    }

    @Then("User downloads from external drive")
    public void user_downloads_from_external_drive() {

    }

    @Then("User selects documents from bitrix24")
    public void user_selects_documents_from_bitrix24() {

    }

    @Then("User creates files to upload")
    public void user_creates_files_to_upload() {

    }



}
