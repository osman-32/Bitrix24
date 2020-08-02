package com.bitrix24.stepdefinitions;

import com.bitrix24.pages.ActionsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActionsStepDefinitions {

    ActionsPage actionsPages = new ActionsPage();

    @When("User clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() throws Exception {
        Thread.sleep(1000);
        actionsPages.moreButton.click();
        Thread.sleep(1000);
        actionsPages.fileButton.click();
        Thread.sleep(2000);
        actionsPages.uploadButton.click();

    }

    @Then("User uploads files and pictures from local disks")
    public void user_uploads_files_and_pictures_from_local_disks() {

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
