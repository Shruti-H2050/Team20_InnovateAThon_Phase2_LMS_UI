Feature: Navigation Validation from Manage Program to other Pages

Background:
Given Admin is on dashboard page after Login and clicks Program on the navigation bar

@navigationTag1
Scenario: Batch link on navigation bar
Given Admin is on Manage Program page

When Admin clicks on Batch link on Manage Program page
Then Admin is re-directed to Batch page

When Admin clicks on User link on Manage Program page
Then Admin is re-directed to User page

When Admin clicks on Logout link on Manage Program page
Then Admin is re-directed to Login page