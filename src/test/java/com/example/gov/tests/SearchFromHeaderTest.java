package com.example.gov.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFromHeaderTest extends TestBase{
    @Test
    public void typeInSearchFieldTest(){
        String searchItem = "קבלת קהל";
        app.header().typeInSearchField("קבלת קהל");
        app.header().clickOnTheLoupe();
        String pageName = app.getSearchResultPageTitle();
        System.out.println(pageName);
        Assert.assertTrue(pageName.contains(searchItem));
    }

    @Test
    public void SearchReceptionFromHeader(){
        String searchItem = "קבלת קהל";
        app.header().clickOnReception();


        String pageName = app.getPageTitle();
        System.out.println(pageName);
        Assert.assertTrue(pageName.contains(searchItem));
    }

    @Test
    public void SearchAshdodReceptionFromHeader(){

        app.header().clickOnReception();
        app.searchResult().selectReceptionCity("אשדוד");



      //  Assert.assertTrue(pageName.contains("searchItem"));
    }
}
