Feature: Edit Batch Validation

 Background: 
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page
    When Admin clicks "Batch" from navigation bar. 

  @EB_001
  Scenario: Validate row level edit icon
    Given The edit icon on row level in data table is enabled
    When Admin clicks the edit icon at row level
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
    When Erase data from description field 
    Then See Error message appears if the description is mandatory.
   

    
 
 