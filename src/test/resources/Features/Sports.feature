Feature: Searching product in Sports Tab

  @tag("ProductSearch")
  Scenario Outline: User trying to search product
    Given Launch URL to open SportsJam
    When User clicking SignIn link
    And User enters details using excel sheet "<sheetname>" and <rownumber>
    And User clicking Sports Tab,trying to click english willow product
    And User changing price from low to High
    Then Display the products as a grid,also validating
    
Examples:

 |sheetname|rownumber|
 |sheet1   |    0    |