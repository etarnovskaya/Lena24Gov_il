package com.example.gov.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchResulthelper extends HelperBase{
    public SearchResulthelper(WebDriver wd) {
        super(wd);
    }

    public void selectReceptionCity(String city) {
        new Select(wd.findElement(By.cssSelector("#city")))
                .selectByVisibleText(city);
    }
}
