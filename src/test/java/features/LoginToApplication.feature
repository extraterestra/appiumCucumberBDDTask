Feature: Login to application
  @positive
  Scenario: The user can log in with valid credentials
    Given Application is opened in emulator
    When User Click Log In Button
    Then Listing page opened with listing option 'Native View'


  @negative
  Scenario: The user can not log in with invalid credentials
    Given Application is opened in emulator
    When User fill 'invalidPassword' in password field
    And User Click Log In Button
    Then Invalid Credentials pop up displayed with text 'Invalid  Credentials'
    When User can close pop up
    Then Log in screen displayed
