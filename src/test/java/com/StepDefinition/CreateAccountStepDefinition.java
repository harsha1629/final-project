package com.StepDefinition;

import org.testng.Assert;

import com.actions.CreateAccountAction;
import com.actions.MyAccountAction;
import com.utility.DataProviders;
import com.utility.Helper_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepDefinition {
	MyAccountAction myAccountaction = new MyAccountAction();
	CreateAccountAction accountAction = new CreateAccountAction();
	DataProviders dp = new DataProviders();

	@Given("Launch URL to open SportsJam")
	public void launch_url_to_open_sports_jam() {
		Helper_Class.openPage(dp.url);
	}

	@When("User clicking create Account link")
	public void user_clicking_create_account_link() {
		accountAction.clickCreateAccount();
		Helper_Class.log.info("User clicks Create Account");
	}

	@When("User enters FirstName,MobileNo,Email,Password and ConfirmPassword")
	public void user_enters_first_name_mobile_no_email_password_and_confirm_password() {
		accountAction.createAccountDetails(dp.firstName, dp.mobileNumber, dp.Email, dp.Password, dp.ConfirmPassword);
		Helper_Class.log.info("User entering values to create Account");
	}

	@When("User clicks the Submit button")
	public void user_clicks_the_submit_button() {
		accountAction.ClickingSubmitButton();
		Helper_Class.log.info("Clicking submit Button");
	}

	@Then("User able to see logged in Page and logging out")
	public void user_able_to_see_logged_in_page_and_logging_out() {
		Assert.assertTrue(accountAction.clicklogoutBtn().contains("Logout"));
		Helper_Class.log.info("User is in Home Page and Logging Out");
	}

}