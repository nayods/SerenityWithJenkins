package com.james.frameworks.SearchLandroverCarTitle.steps;

import com.james.frameworks.SearchLandroverCarTitle.steps.serenity.TitleSearchSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchByKeywordStepDefinitions {
    @Steps
    TitleSearchSteps buyer;

    

@Given("^I am on the Landrover webpage$")
public void i_am_on_the_Landrover_webpage() throws Exception {
	 buyer.opens_landrover_home_page();
}


@When("^I enter the title '(.*)'$")
public void i_enter_the_title_evouge(String keyword) throws Exception {
  buyer.searches_for_items_containing(keyword);
}

@Then("^I should be able to see the title '(.*)'$")
public void i_should_be_able_to_see_the_title_EXPLORE_LAND_ROVER(String title) throws Exception {
  buyer.should_see_items_related_to(title);
}





}