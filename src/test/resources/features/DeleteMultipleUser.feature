@tag
Feature: Delete Multiple User

  @tag1
  Scenario: Validate Common Delete button enabled after clicking on any checkbox
    Given Admin is in Manage User pages
    When Admin clicks any checkbox in the data tables
    Then Admin should see common delete option enabled under header Manage Users

  @tag2
  Scenario: Admin should land on Manage User page and can see the selected user is deleted from the data table
    Given : Admin is on Confirm Deletion alerts
    When Admin clicks <YES> button on the alerts
    Then Admin should land on Manage User page and can see the selected user is deleted from the data tables
    When Admin clicks <No> button on the alerts
    Then Admin should land on Manage User page and can see the selected user is not deleted from the data tables
