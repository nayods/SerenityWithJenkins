package com.nayods.frameworks.verificotesting.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.etsy.com")                      
public class HomePage extends PageObject {              

    @FindBy(css = "button[value='Search']")
    WebElement searchButton;

    public void searchFor(String keywords) {
        $("#search-query").sendKeys(keywords);          
        searchButton.click();                           
    }
    
    
    
    // shipment Methods begins
    //navigating the products
    @FindBy(css = "#catnav-primary-link-10923")
    WebElementFacade categoryNavigations;
    
    @FindBy(css = "#side-nav-category-link-10936")
    WebElementFacade first_category_nave_click;
    
    @FindBy(css = "#catnav-l3-10937")
    WebElementFacade secondary_category_link_click;
    
    
    public void tab_navigator_click() {
		categoryNavigations.click();
		first_category_nave_click.click();
		secondary_category_link_click.click();
		waitABit(5000);
	}
    // selecting product to buy
    @FindBy(css = "#content > div > div.content.bg-white.col-md-12.pl-xs-1.pr-xs-0.pr-md-1.pl-lg-0.pr-lg-0.bb-xs-1 > div > div.mt-xs-2.text-gray.text-control > div.col-group.pl-xs-0.search-listings-group > div:nth-child(2) > div.clearfix > div:nth-child(5) > div:nth-child(2) > a.display-inline-block.listing-link > div.v2-listing-card__info > div > p.text-gray.text-truncate.mb-xs-0.text-body")
    WebElementFacade select_product;
    public void select_product_to_purchase() {
    	
    	select_product.click();
    	waitABit(5000);
    }
    
    @FindBy(css="#inventory-variation-select-0")
    WebElementFacade variants_selector_color;
    
    @FindBy(css="#inventory-variation-select-1")
    WebElementFacade variants_selector_size;
    
    @FindBy(css="#inventory-select-quantity")
    WebElementFacade variants_selector_quantity;
    
    @FindBy(css="#item-info > div > div.buy-box__buttons > div > form > button > div.btn-text")
    WebElementFacade buynowButton;
    @FindBy(css="#multi-shop-cart-list > div:nth-child(1) > div > div.multi-shop-cart-col-group.col-group.position-relative.pl-xs-0.pr-xs-0 > div.payment-col.col-xs-12.col-sm-12.col-md-5.col-lg-4.p-xs-0.pt-xs-2.mt-md-0.mt-xs-2.pt-md-0.pl-md-3.bt-xs-1.bt-md-0.bl-md-1 > div > form > div:nth-child(7) > button > span.submit-button-text")
    WebElementFacade proceedToCheckOut;
    
    @FindBy(css="")
WebElementFacade emailSubmission;    
    @FindBy(xpath="//*[@id=\"guest-checkout-signin-overlay\"]/div/div[2]/form/button/div[2]")
    WebElementFacade continuetoCheckOut;
    
    public void click_on_the_buynow() {
    	variants_selector_color.selectByIndex(1);
    	waitABit(3000);
    	variants_selector_size.selectByIndex(2);
    	waitABit(3000);
    	variants_selector_quantity.selectByIndex(6);
    	waitABit(3000);
    	buynowButton.click();
    	waitABit(300);
    	proceedToCheckOut.click();
    	waitABit(3000);
    	waitForRenderedElementsToDisappear(By.xpath("//*[@id=\"guest-checkout-signin-overlay\"]/div/div[2]"));
    	waitABit(3000);
    	emailSubmission.setWindowFocus();
    	emailSubmission.typeAndEnter("brjakson@yahoo.com");
    	
    	continuetoCheckOut.click();
    	
    }
    
    
}