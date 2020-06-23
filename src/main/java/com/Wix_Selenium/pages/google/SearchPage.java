package com.Wix_Selenium.pages.google;

import com.Wix_Selenium.elements.Button;
import org.openqa.selenium.WebDriver;

public class SearchPage extends GooglePage {
    public Button searchBtn;
    public Button LogoBtn;

    public SearchPage (WebDriver browser) {
        super(browser, "https://www.google.com/");
        initElements();
    }

    @Override
    public void initElements() {
        super.initElements();
        searchBtn = new Button(browser, "[@name='btnK']", "input");
        LogoBtn = new Button(browser, "[@id='hplogo']", "img");
    }

    public void searchGoogle(String searchItem) {
        searchTxB.sendKeys(searchItem);
        LogoBtn.click();
        searchBtn.submit();
    }
}