package com.example.gov.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;

    HeaderHelper header;
    SearchResulthelper searcResult;


    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void init() {
         if (browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        //open Site
        wd.navigate().to("https://gov.il");


        header = new HeaderHelper(wd);
        searcResult = new SearchResulthelper(wd);

    }


    public HeaderHelper header() {
        return header;
    }

    public SearchResulthelper searchResult() {
        return searcResult;
    }

    public void stop() {
        wd.quit();
    }

    public String getSearchResultPageTitle() {
        return wd.findElement(By.cssSelector("h3")).getText();
    }


    public String getPageTitle() {
        return wd.findElement(By.cssSelector("h1")).getText();
    }
}
