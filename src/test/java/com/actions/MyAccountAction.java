package com.actions;

/**
 * @author Harsha Vardhini Viswanathan
 * @since 2023
 * Action class for My account updation
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.locators.MyAccountLocators;
import com.utility.Helper_Class;

public class MyAccountAction {
	WebDriver driver = Helper_Class.getDriver();
	MyAccountLocators myaccountlocators;
	Actions action = new Actions(driver);

	public MyAccountAction() {
		myaccountlocators = new MyAccountLocators();
		PageFactory.initElements(Helper_Class.getDriver(), myaccountlocators);
	}

	public void clickFunction(WebElement webElement) {
		Helper_Class.actions.moveToElement(webElement).click().build().perform();
	}

	// Javascript Function for clicking purpose
	public void javascriptClick(WebElement webElement) {
		Helper_Class.jse.executeScript("arguments[0].click()", webElement);
	}

	// Reusable function for clicking button
	public void clickSignInButton() {
		Helper_Class.wait.until(ExpectedConditions.elementToBeClickable(myaccountlocators.signInBtn));
		clickFunction(myaccountlocators.signInBtn);
	}

	// User entering Username
	public void enterUserName(String username) {
		myaccountlocators.email.sendKeys(username);
	}

	// User entering Password
	public void enterPassword(String pwd) {
		myaccountlocators.enterPwd.sendKeys(pwd);
	}

	// User entering My Account
	public void clickMyAccount() {
		javascriptClick(myaccountlocators.clickMyAccount);
	}

//	public void clickMyAccount() {
//		myaccountlocators.clickMyAccount.click();
//	}

	// User clicking login Button
	public void clickLoginButton() {
		myaccountlocators.loginBtn.click();
	}

	// User setting new Password
	public void setPwd(String password) {
		myaccountlocators.enterPwd.sendKeys(password);
	}

	// User updating lastName
	public void setLastName(String lastName) {
		myaccountlocators.sendLastName.sendKeys(lastName);
	}

	// User choosing female radio Button
	public void clickFemale() {
		myaccountlocators.femaleRadioButton.click();
	}

	// User selecting dob
	public void selectDOB() {
		myaccountlocators.dateofbirth.click();
	}

	// User selecting dob Date
	public void selectDateofBirthValue() {
		myaccountlocators.dateofBirthValue.click();
	}

	// User selecting dob Month
	public void selectMonthOfBirthValue() {
		myaccountlocators.monthOfBirthvalue.click();
	}

	// User selecting dob Month Value
	public void selectMonthOfBirth() {
		myaccountlocators.monthOfBirth.click();
	}

	// User selecting dob Year
	public void selectYearOdBirth() {
		myaccountlocators.yearOfBirth.click();
	}

	// User selecting dob Year Value
	public void selectYearOfBirthValue() {
		myaccountlocators.yearOfBirthValue.click();
	}

	// User selecting Country from dropdown
	public void selectCountry() {
		myaccountlocators.country.click();
	}

	// User selecting Country from dropdown Value
	public void selectCountryValue() {
		myaccountlocators.countryValue.click();
	}

	// User selecting State from dropdown
	public void selectState() {
		myaccountlocators.state.click();
	}

	// User selecting State value from dropdown
	public void selectStateValue() {
		myaccountlocators.stateValue.click();
	}

	// User selecting City from dropdown
	public void sendCity(String city) {
		myaccountlocators.myAccountCity.sendKeys(city);
	}

	// User entering zipcode
	public void sendZipcode(String zipcode) {
		myaccountlocators.myAccountPinCode.sendKeys(zipcode);
	}

	// User clicking submit button
	public void clickSubmitButton() {
		myaccountlocators.myAccountSubmitButton.click();
	}

	// User verifying after Creating Account
	public String verifySuccessfulText() {
		return myaccountlocators.successfullText.getText();
	}

	// User Giving user details to signIn
	public void signInDetails(String username, String password) {
		enterUserName(username);
		enterPassword(password);
	}

	// User Giving user details to My profile
	public void MyProfileDetails(String lastName, String city, String zipcode) {
		setLastName(lastName);
		sendCity(city);
		sendZipcode(zipcode);

	}

	// My Order Action
	public void clickMyOrder() {
		myaccountlocators.myOrderclick.click();
	}

	// User trying to get orders by entering from Date
	public void clickFromDate() {
		myaccountlocators.myOrderFromDate.click();
	}

	// User trying to get orders by entering from Dates
	public void clickDate() {
		myaccountlocators.fromdateValue.click();
	}

	// User trying to get orders by entering To Date
	public void clickToDate() {
		myaccountlocators.myOrderToDate.click();
	}

	// User trying to get orders by entering To Dates
	public void clickToDateValue() {
		myaccountlocators.toDate.click();
	}

	// User trying to click search Orders
	public void clickSearchButton() {
		myaccountlocators.myOrderSearchButton.click();
	}

	// User trying to verify orders placed or Empty cart message
	public String getOrderVerifyText() {
		return myaccountlocators.myOrderVerifyText.getText();

	}

	// User trying to verify orders placed or No order text
	public String getNoOrderText() {
		return myaccountlocators.NoOrdersfound.getText();

	}

	// My Shopping List Locators
	public void clickMyShoppingList() {
		myaccountlocators.myShoppingListClick.click();
	}

	public String verifyShoppingListText() {
		return myaccountlocators.shoppingListText.getText();

	}

	// My saved cart Action
	public void clickShoppingCart() {
		myaccountlocators.savedCartClick.click();
	}

	public String verifyShoppingCartText() {
		return myaccountlocators.savedCartText.getText();
	}

	// My saved Addresses
	public void clickMySavedAddress() {
		myaccountlocators.clicksavedAddressClick.click();
	}

	// User verifying saved Address same as entered
	public String verifySavedAddress() {
		return myaccountlocators.savedAddressText.getText();

	}

	// Changing Password
	public void clickMyPassword() {
		myaccountlocators.clickMyPassword.click();
	}

	// Updating password
	public void sendCurrentPassword(String currentPassword) {
		myaccountlocators.currentPassword.sendKeys(currentPassword);
	}

	// Updating with new password
	public void sendNewPassword(String newPassword) {
		myaccountlocators.newPassword.sendKeys(newPassword);
	}

	// Confirming entering New password
	public void sendConfirmNewPassword(String confirmNewPassword) {
		myaccountlocators.changeConfirmNewPassword.sendKeys(confirmNewPassword);
	}

	// After updating password clicking submit
	public void submitClick() {
		myaccountlocators.clickSubmit.click();

	}

	// Updating password method
	public void sendNewPasswordValues(String currentPassword, String newPassword, String confirmNewPassword) {
		sendCurrentPassword(currentPassword);
		sendNewPassword(confirmNewPassword);
		sendConfirmNewPassword(confirmNewPassword);
	}

	// Searching products and filtering price in ascending Order
	public void clickSports() {
		action.moveToElement(myaccountlocators.sportsTab).click().perform();
	}

	// Searching products
	public void clickEnglishWillow() {
		action.moveToElement(myaccountlocators.englishWillow).click().build().perform();
	}

	// Choosing price from DropDown
	public void clickSortBy() {
		myaccountlocators.sortByPrice.click();
	}

	// Choosing price from DropDown low to high
	public void clickPrice() {
		myaccountlocators.price.click();
	}

	// To view list of Orders size
	public void getGrid() {
		List<WebElement> element = Helper_Class.getDriver().findElements(By.xpath(myaccountlocators.gridValues));
		int size = element.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement element1 : element) {
			System.out.println("Product Name :" + element1.getText());
		}
	}

	// To view list of Orders list
	public void orderList() {
		List<WebElement> orders = Helper_Class.getDriver().findElements(By.xpath(myaccountlocators.orderList));
		int size = orders.size();
		System.out.println("Count of products diplayed = " + size);
		for (WebElement listOrders : orders) {
			System.out.println("Product Name :" + listOrders.getText());
		}
	}

	public String savedAddresses() {
		return myaccountlocators.savedAddresses.getText();
	}

	public String verifyAddressName() {
		return myaccountlocators.verifyAddress.getText();
	}
}
