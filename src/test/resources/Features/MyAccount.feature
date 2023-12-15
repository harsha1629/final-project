Feature: Filling User profile Details in SportsJam

@tag("MyAccount")
  Scenario Outline: User trying to access My profile in My Account
    Given Launch URL to open SportsJam
    When User clicking SignIn link
    And User enters details using excel sheet "<sheetname>" and <rownumber>
    When User click female radio,entering LastName,DOB,dateOfMonth,DateofYear,Country,State,City,Zipcode
    And User clicks the Submit button
    Then User validates the Successfully created message
		When User trying to view order list
		When User entering fromDate,ToDate
		And User clicking search option to view orders
		And User getting Order List
		When User clicks shopping List to display
		When User trying to verify Shopping List text
		When User trying to enter into shoppingList cart
		When User verifying shopping List Cart Text
		When User clicks My saved Addresses
		And User confirms Saved Address
#		When User clicks My password
#		And User fills current password,New password,Confirm New Password
 
 Examples:
 |sheetname|rownumber|
 |sheet1   |    0    |
