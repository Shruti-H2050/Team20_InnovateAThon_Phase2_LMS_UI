Feature: Delete user

  @tag1
  Scenario: Validate row level delete icon
    Given Admin is on Manage user page
    When Admin clicks the delete icon
    Then Admin should see an alert pop-up with heading

  @tag2
  Scenario: Click Yes on deletion window
    Given Admin is on Confirm Deletion alert
    When Admin clicks yes option
    Then Admin gets a message "Successful User Deleted" alert and do not see that user in the data table

  @tag3
  Scenario: Click No on deletion window
    Given Admin is on Confirm Deletion alert
    When Admin clicks No option
    Then Admin can see the deletion alert disappears without deleting

  @tag4
  Scenario: Validate Close(X) icon
    Given Admin is on Confirm Deletion alert
    When Admin clicks on close button
    Then Admin can see the deletion alert disappears without any changes
