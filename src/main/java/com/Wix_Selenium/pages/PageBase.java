package com.Wix_Selenium.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    protected WebDriver browser;
    private String url;

    public PageBase(WebDriver driver,String url) {
        browser = driver;
        navigateToPage(url);
        waitForPageToLoad();
    }

    public PageBase(WebDriver driver) {
        browser = driver;
        url = driver.getCurrentUrl();
        waitForPageToLoad();
    }

    private void navigateToPage(String url) {
        if (!browser.getCurrentUrl().equals(url)) {
            browser.get(url);
        }
    }

    public String getUrl() {
        return url;
    }

    protected void waitForPageToLoad() {
        new WebDriverWait(browser, 10).until(browser -> isPageLoadFinished());
    }

    private boolean isPageLoadFinished() {
        return ((JavascriptExecutor)browser).
                executeScript("return document.readyState").toString().equals("complete");
    }
}