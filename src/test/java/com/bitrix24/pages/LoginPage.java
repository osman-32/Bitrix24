package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public  class LoginPage extends BasePage{

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public LoginPage() {//constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//input[@class='login-inp'][1]" )
    public WebElement usernameBox;

    @FindBy(xpath ="(//input[@class='login-inp'])[2]" )
    public WebElement passwordBox;

    @FindBy(xpath ="//input[@type='submit']" )
    public WebElement loginButton;

    public void login(String userName, String Password) {

        wait.until(ExpectedConditions.visibilityOf(usernameBox)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordBox)).sendKeys(Password);
        loginButton.click();

    }

//Nagihan

}
