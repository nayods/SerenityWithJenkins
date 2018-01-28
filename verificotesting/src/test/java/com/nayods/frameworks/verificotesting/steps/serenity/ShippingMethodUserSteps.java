package com.nayods.frameworks.verificotesting.steps.serenity;

import com.nayods.frameworks.verificotesting.pages.HomePage;

public class ShippingMethodUserSteps {

	HomePage homepage;
	
	
	public void open_etsy_homepage() {
		homepage.open();
	}
	
	public void select_TabNavigation() {
	
		homepage.tab_navigator_click();
	}
	
	public void navigate_to_checkout() {
	
	}
	
	public void Select_product_to_buy() {
       homepage.select_product_to_purchase();
	}
	
	public void Purchase_product_Now() {
		homepage.click_on_the_buynow();
	}
}
