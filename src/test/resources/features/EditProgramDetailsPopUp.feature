Feature: Edit Program Details PopUp

Background: 
Given Admin is on Manage Program Page after clicks Program on the navigation bar
@editPgmDetailsTag1					
Scenario: Edit Program Name
Given Admin is on Program Details Popup window to Edit
When Admin edits the Name column and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

@editPgmDetailsTag2ExtraSecnario
Scenario: Edit Program Name Extra Scenario
Given Admin is on Program Details Popup window to Edit
When Admin clears and edits the Name column and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

@editPgmDetailsTag3
Scenario: Edit Program description
Given Admin is on Program Details Popup window to Edit
When Admin edits the Description column and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program

@editPgmDetailsTag4
Scenario: Change Program Status
Given Admin is on Program Details Popup window to Edit
When Admin changes the Status and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program

@editPgmDetailsTag5
Scenario: Validate invalid values on the text column
Given Admin is on Program Details Popup window to Edit
When Admin enters only numbers or special char in name and desc column
Then Admin gets a Error message alert 
@editPgmDetailsTag6
Scenario: Validate Cancel button on Edit popup
Given Admin is on Program Details Popup window to Edit
When Admin clicks <Cancel>button on edit popup
Then Admin can see the Program details popup disappears and can see nothing changed for particular program
@editPgmDetailsTag7
Scenario: Validate Save button on Edit popup
Given Admin is on Program Details Popup window to Edit
When Admin clicks <Save>button on edit popup
Then Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program

 