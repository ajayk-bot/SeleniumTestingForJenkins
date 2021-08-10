@Search-Cars
Feature: To validate the search cars page is working fine

  @Search-Cars-Positive-Scenario
  Scenario: Validate search cars page
    Given I am on the Home page "https://www.carsguide.com.au/" of CarsGuide website.
    When I move to Menu
      | Menu         |
      | Buy and Sell |
      | Reviews      |
      | Advice       |
    And click on "Search Cars" link
    And select CarBrand as "BMW" from AnyMake dropdown
    And select CarSeries as "1 Series" from AnyModel dropdown
    And select CarLocation as "NSW - All" from AnyLocation dropdown
    And select CarPrice as "$7,500" from AnyPrice dropdown
    And click on Find_My_Next_Car button
    Then I see list os searched cars
    And the page title should be "Bmw 1 Series Under 7500 for Sale NSW | carsguide"

  Scenario: verify the menu items under Buy and Sell
    Given I am on the Home page "https://www.carsguide.com.au/" of CarsGuide website.
    When I move to Menu
      | Menu         |
      | Buy and Sell |
      | Reviews      |
      | Advice       |
    Then count the number of menu items
    Then menus items should be "8"
    Then under Menu should be
      | Search Cars            |
      | Used                   |
      | New                    |
      | Find a Dealer          |
      | What car should I buy? |
      | Sell my car            |
      | Manage My Ad           |
      | Car Selling Tips       |
