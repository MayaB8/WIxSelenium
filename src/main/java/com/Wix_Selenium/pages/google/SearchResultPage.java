package com.Wix_Selenium.pages.google;

import com.Wix_Selenium.elements.Link;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends GooglePage {
    protected Link firstResultLnk;

    public SearchResultPage(WebDriver browser) {
        super(browser);
        initElements();
    }

    @Override
    public void initElements() {
        super.initElements();
        firstResultLnk = new Link(browser,"", "h3" );
    }

    public void openFirstResult() {
        firstResultLnk.click();
    }
}