package com.bitrix24.StepDefinitions;

import com.bitrix24.pages.DownloadDesktopClientPage;
import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class DownloadDesktopClientStepDefinitions {

    LoginPage login = new LoginPage();
    @Given("User logged in to Bitrix24")
    public void userLoggedInToBitrix24() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));



        String username = ConfigurationReader.getProperty("hr_username");
        String password = ConfigurationReader.getProperty("bitrix_password");

        login.login(username, password);
    }

    @When("User should be able to click on MacOs icon under Desktop Client")
    public void user_should_be_able_to_click_on_mac_os_icon_under_desktop_client() {
        DownloadDesktopClientPage.click_to_macos_icon();
    }

    @Then("User should see MacOS version of Bitrix downloaded")
    public void user_should_see_mac_os_version_of_bitrix_downloaded() throws InterruptedException{
        Thread.sleep(70000);
        Assert.assertTrue(DownloadDesktopClientPage.isFileDownloaded("C:\\Users\\nghnn\\Downloads", "bitrix24_desktop.dmg"));
    }

    @When("User should be able to click on Windows icon under Desktop Client")
    public void user_should_be_able_to_click_on_windows_icon_under_desktop_client() {
        DownloadDesktopClientPage.click_to_windows_icon();
    }

    @Then("User should see Windows version of Bitrix downloaded")
    public void user_should_see_windows_version_of_bitrix_downloaded() throws InterruptedException{
        Thread.sleep(70000);
        Assert.assertTrue(DownloadDesktopClientPage.isFileDownloaded("C:\\Users\\ilker\\Downloads\\", "bitrix24_desktop.exe"));
    }
    @When("User should be able to click on Linux icon under Desktop Client")
    public void user_should_be_able_to_click_on_linux_icon_under_desktop_client() {
        DownloadDesktopClientPage.click_to_linux_icon();
    }

    @Then("User should see Linux version of Bitrix downloaded")
    public void user_should_see_linux_version_of_bitrix_downloaded() throws InterruptedException{
        Thread.sleep(5000);

        ArrayList<String> tabs2 = new ArrayList<String> (Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs2.get(1));

        Assert.assertEquals(Driver.getDriver().getTitle(), "GitHub - buglloc/brick: An open source Bitrix24 messenger client.");
    }

}
