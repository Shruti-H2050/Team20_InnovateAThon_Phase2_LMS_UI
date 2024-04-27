Feature: Manage Program Validation

  Background: Validate login with valid credentials
  Given Admin is in Home Page
	When Admin enter valid credentials username as "sdetorganizers@gmail.com" and password "UIHackathon@02" and clicks login button 
	Then Admin should land on dashboard page
@landingOnPgmPage
  Scenario: Validate landing in Program page
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see URL with "Manage Program"
@checkHeading
  Scenario: Validate the heading
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a heading with text "Manage Program" on the page
@paginationCheck
  Scenario: Validate the text and pagination icon below the data table
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table
@validateFooter
  Scenario: Validate the footer
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the footer as "In total there are z programs".
@validateDeleteButtonOnTopLeft
  Scenario: Validating the default state of Delete button
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a Delete button on the top left hand side as Disabled
@aNewPgmButton
  Scenario: Validate Add New Program
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see a "+A New Program" button on the program page above the data table
@countNumOfRecordsPresent
  Scenario: Validate that number of records (rows of data in the table) displayed
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the number of records (rows of data in the table) displayed on the page are 5
@checkTableColumnHeaders
  Scenario: Verify data table on the Program page
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see data table on the Manage Program Page with following column headers (Program Name, Program Description, Program Status, Edit,Delete)
@checkSortArrowIcon
  Scenario: Verify Sort arrow icon on the data table
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the sort arrow icon beside to each column header except Edit and Delete
@checkCheckBoxPresent
  Scenario: Verify Check box on the data table
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see check box on the left side in all rows of the data table
@editAndDeleteButton
  Scenario: Verify Edit and Delete buttons
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the Edit and Delete buttons on each row of the data table
@searchBar
  Scenario: Verify Search bar on the Program page
    Given Admin is on dashboard after login
    When Admin clicks "Program" on the navigation bar
    Then Admin should see Search bar with text as "Search..."
