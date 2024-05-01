Feature: Assign Student


  Background:
    Given Admin is on Manage User after clicking User on the navigation bar

  Scenario: Validate Assign Student Popup window
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see a popup open for assign student details with an empty form
    And the popup should include Save and Cancel buttons
    And there should be a close (X) icon on the top right corner of the window

  Scenario: Validate input fields and their text boxes in Assign Student form
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see User Role as R03
    And other fields such as Student Email id, Program Name, Batch Name, and Status with respective input boxes

  Scenario: Validate Dropdown in Assign Student Form
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see User Role as R03
    And other fields such as Student Email id, Program Name, Batch Name, and Status with respective input boxes

  Scenario: Validate radio button in Assign Student Form
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see drop down boxes with valid data for Student Email id, Program Name, and Batch Name

  Scenario: Validate Dropdown in Assign Student Form
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see drop down boxes with valid data for Student Email id, Program Name, and Batch Name

  Scenario: Validate radio button in Assign Student Form
    Given Admin is in the manage user page
    When Admin clicks the "Assign Student" button
    Then Admin should see two radio buttons for Status
Scenario: Validate the Assign Student form page without giving Student Email id
    Given Admin is in Assign Student details pop up page
    When Admin clicks "Save" button with entering any data	
    Then Admin gets a Error message alert 

Scenario: Validate the Assign Student form page without giving Student Email id
    Given Admin is in Assign Student details pop up page
    When Admin clicks "Save" button without entering Student Email id
    Then Admin gets a Error message alert as "User Email id is required"

Scenario: Validate the Assign Student form page without selecting Program
    Given Admin is in Assign Student details pop up page
    When Admin clicks "Save" button without selecting program
    Then Admin gets a Error message alert as "Program is required"

Scenario: Validate the Assign Student form page without selecting batch
    Given Admin is in Assign Student details pop up page
    When Admin clicks "Save" button without selecting batch
    Then Admin gets a Error message alert as "Batch is required"

Scenario: Validate the Assign Student form page without giving Status
    Given Admin is in Assign Student details pop up page
    When Admin clicks "Save" button without giving status
    Then Admin gets a Error message alert as "Status is required"

Scenario: Validate Cancel/Close(X) icon on Assign Student form
    Given Admin is in Assign Student details pop up page
    When Admin clicks Cancel/Close(X) Icon on Assign Student form
    Then Assign Student popup window should be closed without saving

#Scenario: Validate Save button on Assign Student form
    #Given Admin is in Assign Student details pop up page
    #When Enter all the required fields with valid values and click Save button
    #Then Admin gets a message "Successfully Student Assigned" alert 

Scenario: Validate Cancel button on Assign Student form
    Given Admin is in Assign Student details pop up page
    When Admin clicks <Cancel> button
    Then Admin can see the Assign Student popup disappears without assigning 
    