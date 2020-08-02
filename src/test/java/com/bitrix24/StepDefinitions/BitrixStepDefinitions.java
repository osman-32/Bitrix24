package com.bitrix24.StepDefinitions;


import com.bitrix24.pages.ActionsPage;


import com.bitrix24.pages.LandingPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BitrixStepDefinitions {

    ActionsPage actionsPage = new ActionsPage();
    LandingPage landingPage = new LandingPage();

    LoginPage loginPage = new LoginPage();

    @When("User clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {



    }
    @When("User enters credentials on login page")
    public void user_enters_credentials_on_login_page() throws Exception {


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("hr_username2"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("bitrix_password"));


        Thread.sleep(1000);
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


    @Then("User clicks on Add mention icon")
    public void user_clicks_on_add_mention_icon()throws Exception {
        landingPage.message.click();
        Thread.sleep(1000);
        landingPage.textIcon.click();

    }

    @Then("User Adds mention")
    public void user_adds_mention() {
        landingPage.textIcon.click();
    }

    @Then("User selects contacts from the lists provided from in dropdown")
    public void user_selects_contacts_from_the_lists_provided_from_in_dropdown() throws Exception {
        Thread.sleep(1000);
        landingPage.contactsList.click();

    }

}
