package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountLocators {
	//Locator of Click My account
	@FindBy(xpath = "//a[text()='My Account']")
	public WebElement clickMyAccount;

	//Locator of Click Sign In 
	@FindBy(xpath = "//div[@id='myaccount']//child::a[@class='loginlnk LoginPopUpLink signin']")
	public WebElement signInBtn;

	//Locator of email text box
	@FindBy(xpath = "(//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName'])[1]")
	public WebElement email;

	//Locator of password text box
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password']")
	public WebElement enterPwd;

	//Locator of clicking Login Button
	@FindBy(xpath = "(//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton'])")
	public WebElement loginBtn;

	//Locator of lastName text box
	@FindBy(id = "txtLastName")
	public WebElement sendLastName;

	//Locator of clicking radio Button
	@FindBy(id = "Radio2")
	public WebElement femaleRadioButton;

	//Locator of date Of Birth from from dropdown 
	@FindBy(id = "drpday")
	public WebElement dateofbirth;

	//Locator of date Of Birth from dropdown 
	@FindBy(xpath = "//select[@id='drpday']//child::option[17]")
	public WebElement dateofBirthValue;

	//Locator of date Of Month from dropdown 
	@FindBy(id = "drpmonth")
	public WebElement monthOfBirth;

	//Locator of date Of Month Value from dropdown 
	@FindBy(xpath = "//select[@id='drpmonth']//child::option[12]")
	public WebElement monthOfBirthvalue;

	//Locator of Year of Birth from dropdown 
	@FindBy(id = "drpyear")
	public WebElement yearOfBirth;

	//Locator of Year of Birth from dropdown 
	@FindBy(xpath = "//select[@id='drpyear']//child::option[52]")
	public WebElement yearOfBirthValue;

	//Locator of Country from dropdown 
	@FindBy(id = "drpCountry")
	public WebElement country;

	//Locator of Country Value from dropdown 
	@FindBy(xpath = "//select[@id='drpCountry']//child::option[text()='India']")
	public WebElement countryValue;

	//Locator of state from dropdown 
	@FindBy(id = "drpStates")
	public WebElement state;

	//Locator of state Tamilnadu from dropdown 
	@FindBy(xpath = "//select[@id='drpStates']//child::option[text()='Tamil Nadu']")
	public WebElement stateValue;

	//Locator of City from dropdown 
	@FindBy(id = "drpCity")
	public WebElement myAccountCity;

	//Locator of zipcode
	@FindBy(id = "txtZipCode")
	public WebElement myAccountPinCode;

	//Locator of clicking Submit Button
	@FindBy(id = "btnSubmit")
	public WebElement myAccountSubmitButton;

	//Locator of verify text message 
	@FindBy(xpath = "(//div[text()='User Details Updated Sucessfully.'])[2]")
	public WebElement successfullText;

	// My Orders Locators path
	@FindBy(xpath = "//a[text()='My Orders ']")
	public WebElement myOrderclick;

	@FindBy(id = "imgFromDate")
	public WebElement myOrderFromDate;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[8]")
	public WebElement fromdateValue;

	@FindBy(id = "imgToDate")
	public WebElement myOrderToDate;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[16]")
	public WebElement toDate;

	@FindBy(xpath = "//div[text()='This page gives you the snapshot of all orders placed from this account. You can find the status of your Orders and you can also reorder the required orders.  ']")
	public WebElement myOrderVerifyText;

	@FindBy(id = "btndatesearch")
	public WebElement myOrderSearchButton;

	// Assertion Checking
	@FindBy(xpath = "//div[@class='smallmsg_text']")
	public WebElement NoOrdersfound;

	// My Shopping List Locators
	@FindBy(xpath = "//a[text()='My Shopping List']")
	public WebElement myShoppingListClick;

	@FindBy(xpath = "(//div[@class='smallmsg_text'])[2]")
	public WebElement shoppingListText;

	// My Saved Cart locators
	@FindBy(xpath = "//a[text()='My Saved Carts']")
	public WebElement savedCartClick;

	@FindBy(xpath = "//div[@class='title mysavedcart']//child::h1")
	public WebElement savedCartText;

	// Saved Addresses Locators
	@FindBy(xpath = "//a[text()='My Saved Addresses']")
	public WebElement clicksavedAddressClick;

	@FindBy(xpath = "//div[@class='title myaddresses']//child::h1[text()='My Saved Addresses']")
	public WebElement savedAddressText;

	// My password Locators
	@FindBy(xpath = "//a[text()='My Password']")
	public WebElement clickMyPassword;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl01_OldPasswordTextbox")
	public WebElement currentPassword;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl01_PasswordTextbox")
	public WebElement newPassword;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl01_PasswordConfirmTextbox")
	public WebElement changeConfirmNewPassword;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl01_btnCreate")
	public WebElement clickSubmit;

	// product searching locators
	@FindBy(xpath = "//a[@class='sf-with-ul']//child::span[text()='Sports']")
	public WebElement sportsTab;
	
	@FindBy(xpath = "//li[@class='English_Willow']//child::a[text()='English Willow']")
	public WebElement englishWillow;
	
	@FindBy(xpath = "//select[@id='drpSort']")
	public WebElement sortByPrice;
	
	@FindBy(xpath = "//select[@id='drpSort']//child::option[@value='pasc']")
	public WebElement price;
	
	//Adding To Cart to get Saved cart
	@FindBy(xpath = "(//div[@class='bucket_left']//child::img[@class='mtb-img'])[1]")
	public WebElement batAddToCart;
	
	public String gridValues = "//div[@class='bucket_left']/h4";

	public String orderList = "//div[@class='order_id']";
	
	@FindBy(xpath = "//div[@class='shipping-address']")
	public WebElement savedAddresses;
	
	@FindBy(xpath = "//div[@class='user-name']")
	public WebElement verifyAddress;
	
}
