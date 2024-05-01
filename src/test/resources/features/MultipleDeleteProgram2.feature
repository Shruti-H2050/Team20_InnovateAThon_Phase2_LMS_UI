Feature: Multiple Delete Program Feature2

Background:
Given Admin clicks delete button under header after selecting multiple checkboxes in the data table

Scenario: Validate multiple program deletion by selecting multiple check boxes
Given Admin is on Confirm Deletion alert
When Admin clicks <YES> button on the alert
Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table

Given Admin is on Confirm Deletion alert
When Admin clicks <NO> button on the alert 
Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table


