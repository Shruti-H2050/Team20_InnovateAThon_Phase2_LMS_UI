Feature: Delete Batch Validation

  Background: 
    Given Logged on the LMS portal
    When Admin is on dashboard page after Login and Admin clicks "Batch" from navigation bar

  @DB_001
  Scenario: Validate row level delete icon
    Given The delete icon on row level in data table is enabled..
    When Admin clicks the delete icon
    Then Alert appears with yes and No option..

  @DB_002
  Scenario: Validate accept alert
    Given Admin clicks on the delete icon
    When You click yes option..
    Then Batch deleted alert pops and batch is no more available in data table..

  @DB_003
  Scenario: Validate reject alert
    Given Admin clicks on the delete icon
    When you click No option..
    Then Batch is still listed in data table..


















































































