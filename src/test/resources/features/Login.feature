Feature: Home Page Verification 
@validcredentials
Scenario: Validate login with valid credentials
Given Admin is in Home Page
When Admin enter valid credentials username and password and clicks login button 
Then Admin should land on dashboard page