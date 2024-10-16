Feature: Batch Page Validation
 
 Background: 
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page
    
  @BPV_001
  Scenario: Validate landing in Batch page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should see the "batch" in the URL.

  @BPV_002
  Scenario: Validate Manage batch header in the Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should see the "Manage Batch" in the header.

  @BPV_003
  Scenario: Validate Pagination in the Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should see the pagination controls under the data table.

  @BPV_004
  Scenario: Validate data table headers in the Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete.

  @BPV_005
  Scenario: Validate Delete button in Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should be able to see the "Delete" icon button that is disabled.
    
  @BPV_006
  Scenario: Validate data rows for checkboxes 
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Each row in the data table should have a checkbox.
    
  @BPV_007
  Scenario: Validate A New button in Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should be able to see the "+ A New Batch" button is enabled.

  @BPV_008
  Scenario: Validate Searchbox in Batch Page
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Admin should be able to see the "Search" box is enabled.

  @BPV_009
  Scenario: Validate data rows
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Each row in data table should have a edit icon that is enabled.
    
  @BPV_010
  Scenario: Validate data rows
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    Then Each row in the data table should have a delete icon that is enabled.

  @BPV_011
  Scenario: Validate pop up for adding batch
    Given Admin is on dashboard page after Login.
    When Admin clicks "Batch" from navigation bar.
    And Admin clicks "A New Batch" button..
    Then A new pop up with Batch details appears..
