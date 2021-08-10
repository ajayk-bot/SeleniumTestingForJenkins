Feature: TO check avaliable menus on CarsGuide site.
  I want to verify the avaliable top navigation Menus on cars guide page.

  Scenario: To  verify top navigation is working
    Given I am on the Home page "https://www.carsguide.com.au/" of CarsGuide website.
    Then I move to menus
    Then Click on Menus One by one
      | Menu            | Validation        |
      | buy + sell      | SEARCH FOR CARS   |
      | reviews         | Car reviews       |
      | news            | Car News          |
      | advice          | Car Advice        |
      | pricing + specs | Pricing and specs |
      | guides          | adventure         |

	