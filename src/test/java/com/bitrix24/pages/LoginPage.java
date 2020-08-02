package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    public void login () {
        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");
        usernameInput.sendKeys(usernameString);
        passwordInput.sendKeys(passwordString);
    }

}
