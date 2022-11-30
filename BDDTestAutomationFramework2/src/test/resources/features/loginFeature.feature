Feature: OrangeHRM Login
  Scenario Outline: Check login functionality of OrangeHRM
    Given I launch firefox browser
    When I open OrangeHRM home page
    When user enters valid "<username>" and "<password>"
    And clicks on login button
    Then Verify Dashboard logo
    And close browser
    
    Examples:
    |username|password|
    |Admin|admin123|
    |ketan|ketan123|
  