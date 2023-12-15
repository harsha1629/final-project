Feature: Creating Account in SportsJam
   
   Background:
						Given Launch URL to open SportsJam

  @tag("CreateAccount")
  Scenario: User trying to create Account using valid details
    When User clicking create Account link
    When User enters FirstName,MobileNo,Email,Password and ConfirmPassword
    And User clicks the Submit button
    Then User able to see logged in Page and logging out

  
		
		
		