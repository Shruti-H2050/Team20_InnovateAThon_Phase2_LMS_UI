
Feature: Add New Batch Validation

  Background: 
    Given Admin is in Home Page
    When Admin enter valid credentials username and password and clicks login button
    Then Admin should land on dashboard page
    When Admin clicks "Batch" from navigation bar.
    And  Admin clicks "A New Batch" button.
    
    

  @ANB_001
  Scenario: Check if the fields are exists in popup
    Given A new pop up with Batch details appears.
    Then The pop up should include the fields Name,Number of classes and Description as text box,Program Name as drop down Status as radio button Number of classes as text box
    
  @ANB_002
  Scenario Outline: Check for success messages and new batch creation with valid data
    Given A new pop up with Batch details appears.
    And Reads data from excel by using "<sheetName>" and <rowNumber> to fill all fields with positive data
    When Click save button
    Then The success message pop up should be displayed
    And The newly added batch should be present in the data table in Manage Batch page
    Examples:
      | sheetName | rowNumber |
	    |  Addbatch | 0         |
           
  @ANB_003
  Scenario Outline: Check for cancel button with valid data
    Given A new pop up with Batch details appears.
    And Reads data from excel by using "<sheetName>" and <rowNumber> to fill all fields with positive data
    When clicks Cancel button
    Then The batch shouldnot be added and shouldnot be displayed with success message
    Examples:
      | sheetName | rowNumber |
	    |  Addbatch | 0         |
           
  @ANB_004
  Scenario: Check for error messages for invalid data
    Given A new pop up with Batch details appears.
    And Reads data from excel by using "<sheetName>" and <rowNumber> to fill fields with negative data
    #When any of the fields have invalid values
    Then Error message should appear
    Examples:
      | sheetName | rowNumber |
	    |  Addbatch | 1         |

  @ANB_005
  Scenario: Check for error messages for mandatory fields
    Given A new pop up with Batch details appears.
    And Reads data from excel by using "<sheetName>" and <rowNumber> to check missing values in mandatory fields 
    #When Any of the mandatory fields are blank
    Then Error message should appear
    Examples:
      | sheetName | rowNumber |
	    |  Addbatch | 2         |