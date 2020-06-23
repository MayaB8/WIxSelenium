package com.Wix_Selenium.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public abstract class GeneralWebElement {
    private WebElement element;
    public WebDriver browser;
    private By by;

    public GeneralWebElement(WebDriver browser, String xpath, String tag) {
        this(browser, By.xpath("//"+tag+xpath));
    }

    private GeneralWebElement(WebDriver browser, By by) {
        this.browser = browser;
        this.by = by;
    }

    protected void initElement() {
        if (element == null) {
            element = browser.findElement(by);
        }
    }

    public void click() {
        initElement();
        element.click();
    }

    public void sendKeys(String text) {
        initElement();
        element.sendKeys(text);
    }

    public void submit() {
        initElement();
        element.submit();
    }
}