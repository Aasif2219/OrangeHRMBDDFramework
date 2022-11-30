Feature: OrangeHRM Login
  Scenario: Logo presence in OrangeHRM home page
    Given I launch firefox browser
    When I open OrangeHRM home page
    Then I verify that the logo present on page
    And close browser