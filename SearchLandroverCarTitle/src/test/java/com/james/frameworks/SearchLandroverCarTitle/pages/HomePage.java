package com.james.frameworks.SearchLandroverCarTitle.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.landrover.co.uk")                      
public class HomePage extends PageObject {              

    @FindBy(css = "#header > div.headerWrapper > div.MainNavigation.withLocation > div.SearchButton > a.searchButtonSearch")
    WebElement searchButton;
    
    @FindBy(css="#MainNavSearchForm > label")
    WebElement Searchbox;

    public void searchFor(String keywords) {
        $("#header > div.headerWrapper > div.MainNavigation.withLocation > div.SearchButton > a.searchButtonSearch").sendKeys(keywords);          
        searchButton.click();                           
    }
    
    public void enter_searchTextItem(String title) {
    	
    	$("#MainNavSearchForm > label").sendKeys(title);
    	Searchbox.sendKeys(title);
    	searchButton.click();
    }
    
    
}