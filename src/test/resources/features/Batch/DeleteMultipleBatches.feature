Feature: Delete Multiple Batches Validation

Background: 
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page
    And Admin clicks "Batch" from navigation bar.

  @DMB_001
  Scenario: Validate the delete icon below the header 
    Given None of the checkboxes in data table are selected
    Then The delete icon under the "Manage Batch" header should be disabled
    
  @DMB_002
  Scenario: Check for single row delete
    Given One of the checkbox or row is selected
    When Click delete icon below "Manage Batch" header
    Then The respective row in the data table is deleted

  @DMB_003
  Scenario: Check for multi row delete
    Given Two or more checkboxes or row are selected
    When Click delete icon below "Manage Batch" header
    Then The respective rows in the data table are deleted



  