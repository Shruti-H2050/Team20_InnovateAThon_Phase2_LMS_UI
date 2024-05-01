Feature: Multiple Delete Program Feature

Background: 
Given Admin is on dashboard page after Login and clicks Program on the navigation bar

@multipleDeleteTag1
Scenario: Validate Common Delete button enabled after clicking on any checkbox
Given Admin is in Manage Program page
When Admin clicks any checkbox in the data table
Then Admin should see common delete option enabled under header Manage Program


