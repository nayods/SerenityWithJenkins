package com.nayods.frameworks.verificotesting.steps;

import com.nayods.frameworks.verificotesting.steps.serenity.BuyerSteps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ShippingMethodsSteps {


	
	@Steps
	BuyerSteps buyers;
	
	@Given("^the customer is on the itse webpage$")
	public void the_customer_is_on_the_itse_webpage() throws Exception {
	   buyers.opens_etsy_home_page();
	   
	}


	@When("^they select the product to puchase$")
	public void they_select_the_product_to_puchase() throws Exception {
		 throw new PendingException();
	}

	@When("^they click on the buynow button$")
	public void they_click_on_the_buynow_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^they are on the payment page$")
	public void they_are_on_the_payment_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^they should be able to select the add shipping method$")
	public void they_should_be_able_to_select_the_add_shipping_method() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
}
