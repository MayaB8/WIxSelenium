package com.Wix_Selenium.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Wix_Selenium.pages.ResultPage;
import com.Wix_Selenium.pages.google.SearchPage;
import com.Wix_Selenium.pages.google.SearchResultPage;

public class GoogleTest extends TestBase {

    @Test
    public void WixTest()
    {
        // Open browser
        ChromeDriver driver = initalizeBrowser();
        SearchPage searchPage = new SearchPage(driver);

        // Search WIX in Google
        searchPage.searchGoogle("WIX");

        // Results Page
        SearchResultPage resultPage = new SearchResultPage(driver);

        // Open First result
        resultPage.openFirstResult();

        // Is WIX opened
        ResultPage wixPage = new ResultPage(driver);
        String wixUrl = "www.wix.com";
        Assert.assertTrue(wixPage.getUrl().contains(wixUrl));

        // Close the browser
        closeTest(driver);
    }
}