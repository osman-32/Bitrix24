package com.bitrix24.stepdefinitions;

import com.bitrix24.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TasksStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {

    }


    @When("User clicks on Tasks")
    public void user_clicks_on_button(String string) {

    }
    @Then("Url should contain task")
    public void url_should_contain(String string) {

    }
    @Then("User should click on New Task button")
    public void user_should_click_on_button(String string) {

    }


    @When("User clicks on High priority checkbox")
    public void user_clicks_on_checkbox(String string) {

    }
    @Then("High priority checkbox should be enabled")
    public void checkbox_should_be_enabled(String string) {

    }





}
