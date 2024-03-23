Feature: Login to application

  @smoke
  Scenario: The user can log in with valid credentials
    Given Application 'appiumChallenge' is opened in emulator
    When User Click Log In Button
    Then Listing page opened with listing option 'Native View'


  @smoke
  Scenario Outline: The user can not log in with invalid credentials
    Given Application 'appiumChallenge' is opened in emulator
    When User fill credentials '<usernameValue>' and '<passwordValue>'
    And User Click Log In Button
    Then Invalid Credentials pop up displayed with text 'Invalid  Credentials'
    When User can close pop up
    Then Log in screen displayed

    Examples:
      | usernameValue   | passwordValue   |
      | user            | invalidPassword |
      | invalidUserName | user            |
