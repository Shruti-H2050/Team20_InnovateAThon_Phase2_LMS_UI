
Feature: Verify Dashboard Page

  Background:
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page

  @Dashboardtest1
  Scenario: Admin lands on Manage Program Dashboard Page
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "Manage Program" as header

  @Dashboardtest2
  Scenario: Verify Response Time
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Maximum navigation time in milliseconds defaults to 30 seconds

  @Dashboardtest3
  Scenario: Verify Broken Link
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then HTTP response >= 400. Then the link is broken

  @Dashboardtest4
  Scenario: Verify LMS Title
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "LMS - Learning Management System" as title

  @Dashboardtest5
  Scenario: Verify LMS Title Alignment
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then LMS title should be on the top left corner of page

  @Dashboardtest6
  Scenario: Validate Navigation Bar Text
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see correct spelling in navigation bar text

  @Dashboardtest7
  Scenario: Validate LMS Title Spelling and Space
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see correct spelling and space in LMS title

  @Dashboardtest8
  Scenario: Validate Alignment for Navigation Bar
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see the navigation bar text on the top right side

  @Dashboardtest9
  Scenario: Validate Navigation Bar Order (1st Program)
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "Program" in the 1st place

  @Dashboardtest10
  Scenario: Validate Navigation Bar Order (2nd Batch)
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "Batch" in the 2nd place

  @Dashboardtest11
  Scenario: Validate Navigation Bar Order (3rd User)
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "User" in the 3rd place

  @Dashboardtest12
  Scenario: Validate Navigation Bar Order (4th Logout)
    Given Admin is in Home Page
    When Admin enters valid credentials and clicks login button
    Then Admin should see "Logout" in the 4th place
