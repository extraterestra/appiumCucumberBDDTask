Feature: Login to application
  @smoke
  Scenario: The user can log in with valid credentials
    Given Application is opened in emulator
    When User Click Log In Button
    Then Listing page opened with listing option 'Native View'
