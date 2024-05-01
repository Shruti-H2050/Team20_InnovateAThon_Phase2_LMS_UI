Feature: User Page validation

  Background: 
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page

  @UPV_01
  Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL

  @UPV_02
  Scenario: Validate the heading
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a heading with text "Manage user" on the page

  @UPV_03
  Scenario: Validate the text and pagination icon below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then "Admin should see the text as ""Showing x to y of z entries"" along with Pagination icon below the table.

  @UPV_04
  Scenario: Validate data table headers in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin Should see the data table with column names Id, Name, location, Phone Number, Edit/Delete

  @UPV_05
  Scenario: Validating the default state of Delete button
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see a Delete button on the top left hand side as Disabled

  @UPV_06
  Scenario: Validate "+ A New user" button in User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ A New User" button above the data table

  @UPV_07
  Scenario: Validate "+ Assign staff"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ Assign staff" button above the data table

  @UPV_08
  Scenario: Validate "+ Assign Student"  button in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ Assign Student" button above the data table

  @UPV_09
  Scenario: Validate search box in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the search text box above the data table

  @UPV_10
  Scenario: "Validate number of data rows in the data table"
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see two records displayed on the data table

  @UPV_11
  Scenario: Verify Check box on the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Each row in the data table should have a checkbox

  @UPV_12
  Scenario: Verify edit icon on the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Each row in the data table should have a edit icon that is enabled

  @UPV_13
  Scenario: Verify  delete icon on the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Each row in the data table should have a delete icon that is enabled
    
  @UPV_14
  Scenario: search user by name
    Given Admin is on Manage User Page
    When Admin enters user name into search box.
    Then Admin should see user displayed with the entered name

  @UPV_15
  Scenario: Validating the Search with unrelated keyword
    Given Admin is on Manage User Page
    When Admin enters the keywords not present in the data table on the Search box
    Then Admin should see zero entries on the data table
