package com.nayods.frameworks.verificotesting.steps.serenity;

import com.nayods.frameworks.verificotesting.pages.HomePage;

public class ShippingMethodUserSteps {



	HomePage homepage;
	
	public static String emailaddress="nayods@boxmail.veridone.net";
	public void open_etsy_homepage() {
		homepage.open();
	}
	
	public void select_TabNavigation() {
	
		homepage.tab_navigator_click();
	}
	
	public void navigate_to_checkout() {
	String fulnames = "Micheal kitting";
	String StreetAddr = "Meliners Main Avenue";
	String city = "London";
	String postcode = "SE29 30AA";
	
	homepage.on_the_payments_form_page(fulnames, StreetAddr, city, postcode);
	}
	
	public void Select_product_to_buy() {
       homepage.select_product_to_purchase();
	}
	
	public void Purchase_product_Now() {
		homepage.click_on_the_buynow();
		homepage.submitting_inputField(emailaddress);
	}
}
