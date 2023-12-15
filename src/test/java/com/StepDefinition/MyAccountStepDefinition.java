package com.StepDefinition;
/*
 * My Account is accessed and trying to update Profile,Viewing Saved addresses,Saved Cart and trying to Update Password
 * 
 */

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.actions.MyAccountAction;
import com.utility.DataProviders;
import com.utility.ExcelReader;
import com.utility.Helper_Class;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDefinition {
	MyAccountAction myAccountaction = new MyAccountAction();
	DataProviders data = new DataProviders();
	ExcelReader excelReading = new ExcelReader();

	@When("User clicking SignIn link")
	public void user_clicking_sign_in_link() {
		myAccountaction.clickSignInButton();
				
	}
	
	@When("User enters details using excel sheet {string} and {int}")
	public void user_enters_details_using_excel_sheet_and(String sheetname, Integer rownumber ) throws InvalidFormatException, IOException {
		List<Map<String,String>> testdata=excelReading.getData("C:\\Users\\hviswanathan\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\EmailandPassword.xlsx", sheetname);
		String email = testdata.get(rownumber).get("email");
		String password = testdata.get(rownumber).get("password");
		myAccountaction.signInDetails(email, password );
		myAccountaction.clickLoginButton();
		myAccountaction.clickMyAccount();
		Helper_Class.log.info("Signing In");
	}


	@When("User click female radio,entering LastName,DOB,dateOfMonth,DateofYear,Country,State,City,Zipcode")
	public void user_click_female_radio_entering_last_name_dob_date_of_month_dateof_year_country_state_city_zipcode() {
		myAccountaction.clickFemale();
		myAccountaction.MyProfileDetails(data.lastname, data.city, data.zipcode);
		myAccountaction.selectCountry();
		myAccountaction.selectCountryValue();
		myAccountaction.selectStateValue();
		Helper_Class.log.info("Updating Profile");

	}

	@Then("User validates the Successfully created message")
	public void user_validates_the_successfully_created_message() {
		Assert.assertTrue(myAccountaction.verifySuccessfulText().contains("User Details Updated Sucessfully."));
		Helper_Class.log.info("Verifying successfully updated message");
	}

	@When("User trying to view order list")
	public void user_trying_to_view_order_list() {
		myAccountaction.clickMyOrder();
		Helper_Class.log.info("Viewing orders we placed");
	}

	@When("User entering fromDate,ToDate")
	public void user_entering_from_date_to_date() {
		myAccountaction.clickFromDate();
		myAccountaction.clickDate();
		myAccountaction.clickToDate();
		myAccountaction.clickToDateValue();
		Helper_Class.log.info("Order from Date and To Date");
	}

	@When("User clicking search option to view orders")
	public void user_clicking_search_option_to_view_orders() {
		myAccountaction.clickSearchButton();
		Helper_Class.log.info("Clicking search option to view Orders");

	}

	@When("User getting Order List")
	public void user_getting_order_list()  {
		myAccountaction.orderList();
		Helper_Class.log.info("List of Orders will be displayed");
	}

	@When("User clicks shopping List to display")
	public void user_clicks_shopping_list_to_display() {
		myAccountaction.clickMyShoppingList();
		Helper_Class.log.info("Shopping List");
	}

	@When("User trying to verify Shopping List text")
	public void user_trying_to_verify_shopping_list_text() {
		Assert.assertTrue(
				myAccountaction.verifyShoppingListText().contains("No Products Available in Selected shopping list."));
		Helper_Class.log.info("No products available");
	}

	@When("User trying to enter into shoppingList cart")
	public void user_trying_to_enter_into_shopping_list_cart() {
		myAccountaction.clickShoppingCart();
		Helper_Class.log.info("Viewing Shopping Cart");
	}

	@When("User verifying shopping List Cart Text")
	public void user_verifying_shopping_list_cart_text() {
		Assert.assertTrue(myAccountaction.verifyShoppingCartText().contains("My Saved Cart"));
		Helper_Class.log.info("Saved Cart");
	}

	@When("User clicks My saved Addresses")
	public void user_clicks_my_saved_addresses() {
		myAccountaction.clickMySavedAddress();
		Helper_Class.log.info("Click Saved addresses");
	}

	@When("User confirms Saved Address")
	public void user_confirms_saved_address() {
		myAccountaction.savedAddresses();
		Assert.assertTrue(myAccountaction.verifyAddressName().contains("HarshaVardhiniViswanathan V"));
		Helper_Class.log.info("Address");
	}

//	@When("User clicks My password")
//	public void user_clicks_my_password() {
//		myAccountaction.clickMyPassword();
//	}
//
//	@When("User fills current password,New password,Confirm New Password")
//	public void user_fills_current_password_new_password_confirm_new_password() {
//		myAccountaction.sendNewPasswordValues(data.currentPassword, data.NewPassword, data.ConfirmNewPassword);
//		myAccountaction.submitClick();
//		Helper_Class.log.info("Updating to New Password");
//	}

}
