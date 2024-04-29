Feature: Add New Batch Validation

 Background: 
    Given Logged into the LMS portal.
    When  Admin is on dashboard page after Login and admin clicks on "Batch" from navigation bar
    Then  Admin clicks "+ A New Batch" button 

  @EB_001
  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled
    When Admin clicks the edit icon
    Then A new pop up with Batch details will appears
    
  @EB_002
  Scenario: Check if the fields are updated
    Given Admin clicks the edit icon
    When Update the fields with valid values and click save
    Then The updated batch details should appear on the data table
        
  @EB_003
  Scenario: Check if the update throws error with invalid values
    Given Admin clicks the edit icon
    When Update the fields with invalid values and click save
    Then Error message should appear.

  @EB_004
  Scenario: Check if you get error message when mandatory fields are erased
    Given Admin clicks the edit icon
    When Erase data from mandatory field
    Then Error message should appear.

  @EB_005
  Scenario: Check if description field is optional in update
    Given Admin clicks the edit icon
    When Erase data from mandatory field
    Then The updated batch details should appear on the data table
    

 