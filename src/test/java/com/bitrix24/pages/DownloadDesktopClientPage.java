package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class DownloadDesktopClientPage extends BasePage{



        /*
        @FindBy(xpath = "//*[@id=\"sidebar\"]/div[6]/div[2]/a[1]")
        public static WebElement MacOS_Icon;

        @FindBy(xpath = "//*[@id=\"sidebar\"]/div[6]/div[2]/a[2]")
        public static WebElement Windows_Icon;


        @FindBy(xpath = "//*[@id=\"sidebar\"]/div[6]/div[2]/a[3]")
        public static WebElement Linux_Icon;
        */

        public static boolean isFileDownloaded(String downloadPath, String fileName) {
                File dir = new File(downloadPath);
                File[] dirContents = dir.listFiles();

               for (int i = 0; i < dirContents.length; i++) {
                        if (dirContents[i].getName().equals(fileName)) {
                                // File has been found, it can now be deleted:
                                // dirContents[i].delete();
                                return true;
                        }
                }
                return false;
        }


        public static void click_to_macos_icon(){
                JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
                js.executeScript("document.querySelector(\"#sidebar > div.b24-app-block.b24-app-desktop > div.b24-app-block-content > a:nth-child(1)\").click()");
                // wait.until(ExpectedConditions.visibilityOf(MacOS_Icon)).click();
        }

        public static void click_to_windows_icon(){
                JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
                js.executeScript("document.querySelector(\"#sidebar > div.b24-app-block.b24-app-desktop > div.b24-app-block-content > a:nth-child(2)\").click()");
                // wait.until(ExpectedConditions.visibilityOf(Windows_Icon)).click();
        }

        public static void click_to_linux_icon(){
                JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
                js.executeScript("document.querySelector(\"#sidebar > div.b24-app-block.b24-app-desktop > div.b24-app-block-content > a:nth-child(3)\").click()");
                // wait.until(ExpectedConditions.visibilityOf(Linux_Icon)).click();
        }

}
