package com.StepDefinition;

import com.actions.MyAccountAction;
import com.utility.Helper_Class;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SportsDefinition {
	MyAccountAction sportsAction = new MyAccountAction();
	@When("User clicking Sports Tab,trying to click english willow product")
	public void user_clicking_sports_tab_trying_to_click_english_willow_product() {
		sportsAction.clickSports();
		sportsAction.clickEnglishWillow();
		Helper_Class.log.info("User trying To Search Product");
	}

	@When("User changing price from low to High")
	public void user_changing_price_from_low_to_high() {
		sportsAction.clickSortBy();
		sportsAction.clickPrice();
		Helper_Class.log.info("Price is given from Low to High");
	}

	@Then("Display the products as a grid,also validating")
	public void display_the_products_as_a_grid_also_validating() {
		sportsAction.getGrid();
		Helper_Class.log.info("Getting Product which we Searched as grid view");
	}

}
