Feature: Delete Program PopUp Window

Background:
Given Admin is on Manage Program Page after clicks Program on the navigation bar

@successfulDeletePgm
Scenario: Click Yes on deletion window
Given Admin is on Confirm Deletion alert
When Admin clicks <YES> button on the alert
Then Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table

@deletePgmTag3
Scenario: Click No on deletion window
Given Admin is on Confirm Deletion alert
When Admin clicks <NO> button on the alert
Then Admin can see the deletion alert disappears without deleting

@deletePgmTag4
Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
Given Admin is on Confirm Deletion alert
When Admin clicks Cancel/Close(X) Icon on Deletion alert
Then Admin can see the deletion alert disappears without any changes
