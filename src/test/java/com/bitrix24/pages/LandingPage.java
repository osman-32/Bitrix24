package com.bitrix24.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath = "(//span[.='Message'])[2]")
    public WebElement message;


    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement textIcon;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab')]")
    public WebElement contactsList;




}
