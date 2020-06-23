package com.Wix_Selenium.pages.google;

import com.Wix_Selenium.elements.TextBox;
import org.openqa.selenium.WebDriver;
import com.Wix_Selenium.pages.PageBase;

public class GooglePage extends PageBase {
    public TextBox searchTxB;

    public GooglePage(WebDriver browser, String url) {
        super(browser, url);
        initElements();
    }

    public GooglePage(WebDriver browser) {
        super(browser);
        initElements();
    }

    public void initElements() {
        searchTxB = new TextBox(browser, "[@name='q']",  "input");
    }
}