Feature: Home Page Verification
  @validcredentials
  Scenario: Validate login with valid credentials
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page

  @LoginScenario1
  Scenario: Verify admin is able to land on home page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  @LoginScenario2
  Scenario: Verify admin is able to land on home page with invalid URL
    Given Admin launch the browser
    When Admin gives the invalid LMS portal URL
    Then Admin should recieve 404 page not found error

  @LoginScenario3
  Scenario: Verify for broken link
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then HTTP response >= 400. Then the link is broken

  @LoginScenario4
  Scenario: Verify the text spelling in the page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see correct spellings in all fields

  @LoginScenario5
  Scenario: Verify the company logo
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see logo on the left  side

  @LoginScenario6
  Scenario: Verify application name
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see  LMS - Learning Management System

  @LoginScenario8
  Scenario: Validate sign in content
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see "Please login to LMS application"

  @LoginScenario9
  Scenario: Verify text field is present
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see two text field

  @LoginScenario10
  Scenario: Verify text on the first text field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should "user" in the first text field

  @LoginScenario11
  Scenario: Verify asterik next to user text
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see * symbol next to user text

  @LoginScenario12
  Scenario: Verify text on the second text field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should "password" in the second text field

  @LoginScenario13
  Scenario: Verify asterik next to password text
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see * symbol next to password text

  @LoginScenario14
  Scenario: Verify the alignment of the login button
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see login button on the centre of the page

  @LoginScenario15
  Scenario: Verify input descriptive test in user field
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see user in gray color
@negativelogin
  Scenario Outline: Validate login with different combinations of invalid credentials
    Given Admin is on the Login Page
    When Admin enters invalid credentials with username <username> and password <password> and clicks the login button
    Then an error message "<expectedMessage>" should be displayed

    Examples: 
      | username          | password          | expectedMessage                                |
      | ""                | "UIHackathon@02"  | Please enter your user name                    |
      | "invalidusername" | "invalidpassword" | Invalid username and password Please try again |
