Feature: To validate the used cars page is working fine

  Scenario: Validate Used cars page
    Given I am on the Home page "https://www.carsguide.com.au/" of CarsGuide website.
    When I move to Menu
      | Menu         |
      | Buy and Sell |
      | Reviews      |
      | Advice       |
    And click on "Used" link for used search page
    And select CarBrand as "Ford" from AnyMake dropdown from used search page
    And select CarSeries as "Cobra" from AnyModel dropdown from used search page
    And select CarLocation as "ACT - All" from AnyLocation dropdown from used search page
    And select CarPrice as "$2,000" from AnyPrice dropdown from used search page
    And click on Find_My_Next_Car button from used search page
    Then I see list of used cars
    And the page title should be "Used Ford Cobra Under 2000 for Sale NSWTEST | carsguide"

 