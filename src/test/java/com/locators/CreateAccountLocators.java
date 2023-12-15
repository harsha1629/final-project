package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountLocators {
	WebDriver driver;
			
	//Locator of create Account Button
	@FindBy(xpath = "//a[text()='Create Account']")
	public WebElement createAccountClick;

	//Locator of first Name text Box
	@FindBy(id = "txtFirstName")
	public WebElement createfirstname;

	//Locator of Mobile text Box
	@FindBy(xpath = "//span[@class='txt155']//child::input[1]")
	public WebElement createMobileNumber;

	//Locator of Email text Box
	@FindBy(name = "txtUserName")
	public WebElement createEmail;

	//Css Locator of Password text Box
	@FindBy(css = "input.maintxt.InputPassWord")
	public WebElement createPassword;

	//Locator of confirm Password text Box
	@FindBy(id = "txtConfirmPassword")
	public WebElement createConfirmPassword;

	//Locator of Submit button
	@FindBy(name = "btnSubmit")
	public WebElement createSubmitButton;
	
	//Locator of logOut Button
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logoutbtn;


}
