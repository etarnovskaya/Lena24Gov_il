package com.example.gov.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase {
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void typeInSearchField(String searchItem) {
        type(By.cssSelector("[name=SearchForm] input"), searchItem);
    }

    public void clickOnTheLoupe() {
        click(By.cssSelector("#btnSearch"));
    }

    public void clickOnReception() {
        click(By.cssSelector("[href$='bureaus']"));
    }
}
