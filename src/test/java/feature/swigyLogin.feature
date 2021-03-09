Feature: Login into swigy website

  Scenario Outline: Positive scenario to test login functionality
    Given User has opened swigy website on Chrome Browser
    When User enters correct "<mobilenumber>"
    Then user should be able to login successfully

    Examples: 
      | mobilenumber |
      |   7204068100 |
