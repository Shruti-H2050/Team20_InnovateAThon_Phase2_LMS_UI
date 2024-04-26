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


    