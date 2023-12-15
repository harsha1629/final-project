package com.actions;

/**
 * @author Harsha Vardhini Viswanathan
 * @since 2023
 * Action class for Creating Account
 */

import org.openqa.selenium.support.PageFactory;

import com.locators.CreateAccountLocators;
import com.utility.Helper_Class;

public class CreateAccountAction {
	CreateAccountLocators accountLocators;

	public CreateAccountAction() {
		accountLocators = new CreateAccountLocators();
		PageFactory.initElements(Helper_Class.getDriver(), accountLocators);

	}

	//To create new Account
	public void clickCreateAccount() {
		accountLocators.createAccountClick.click();

	}

	//Entering First Name
	public void sendingFirstName(String sendFirstName) {
		accountLocators.createfirstname.sendKeys(sendFirstName);
	}

	//Entering valid phone Number
	public void sendingPhoneNumber(String sendmobileNumber) {
		accountLocators.createMobileNumber.sendKeys(sendmobileNumber);
	}

	//Entering valid mail id
	public void sendingEmail(String sendEmail) {
		accountLocators.createEmail.sendKeys(sendEmail);
	}

	//Entering valid password
	public void sendingPassword(String sendPassword) {
		accountLocators.createPassword.sendKeys(sendPassword);
	}

	//Entering valid confirm password
	public void sendingConfirmPassword(String sendConfirmPassword) {
		accountLocators.createConfirmPassword.sendKeys(sendConfirmPassword);
	}

	//After entering valid credentials clicking create Account
	public void ClickingSubmitButton() {
		accountLocators.createSubmitButton.click();
	}
	
	//Logging account
	public String clicklogoutBtn() {
		return accountLocators.logoutbtn.getText();
		
	}

	//Create account details method	
	public void createAccountDetails(String sendFirstName, String sendmobileNumber, String sendEmail,
			String sendPassword, String sendConfirmPassword) {
		sendingFirstName(sendFirstName);
		sendingPhoneNumber(sendmobileNumber);
		sendingEmail(sendEmail);
		sendingPassword(sendPassword);
		sendingConfirmPassword(sendConfirmPassword);
	}
}
