Feature: Sign-in functionality

   Scenario Outline: Check response when valid email and valid password is entered
    Given User open browser and navigate to onthemarket.com
    And   Click on the sign in tab
    And   Enter "<email>" address in the field
    Then  Click on the next button
    And   Enter "<password>" in the field
    And   Click on the sign in button
    Then  Sign in should be successful
    Examples:
     |email           |password  |
     |crewx@gmail.com |crewx1234 |



