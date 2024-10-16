Feature: Add New User

Background:
 Given Admin is in Home Page
 When Admin enter valid credentials username and password and clicks login button
 Then Admin should land on dashboard page
 And Clicks "User" button on the navigation bar

@ANU_01
Scenario: Validate User Details Popup window
Given Admin is on Manage User Page
When Admin clicks "A New User" button
Then Admin should see pop up open for user details with FirstName,Middle name, Last Name, Location, phone, email, linkedin url,User Role, Role status, visa status,Undergraduate, postgraduate,timezone ,user comments and user fields along with Cancel , Submit andclose buttons

@ANU_02
Scenario: Validate input fields and text boxes in user details form
Given Admin is on Manage User Page
When Admin clicks "A New User" button
Then Admin should see text boxes for the fields First Name, Middlename, Last Name, Location, phone, email, linkedin url, Undergraduate,postgraduate,time zone ,user comments

@ANU_03
Scenario: Validate drop downs in new user form
Given Admin is on Manage User Page
When Admin clicks "A New User" button
Then Admin should see drop downs for the fields User Role, Rolestatus, visa status on user details pop up

@ANU_04
Scenario: Check if user is created when only mandatory fields are entered with valid data
Given Admin is on User details pop up
When Admin enters mandatory fields in the form and clicks on submit button
Then Admin gets message User added Successfully 

@ANU_05
Scenario: Check if user is created when only optional fields are entered with valid data
Given Admin is on User details pop up
When Admin skips to add value in mandatory field
Then Admin should see error message below the test field and the field will be highlighed in red color

@ANU_06
Scenario: Check if user is created when invalid data is entered in all of the fields
Given Admin is on User details pop up
When Admin enters invalid data in all of the  fields in the form and clicks on submit button
Then Admin gets error message and user is not created


@ANU_07
Scenario: Empty form submission
Given Admin is on User details pop up
When Admin clicks on submit button without entering data 
Then user wont be created and Admin gets error message

@ANU_08
Scenario: Validate Cancel/Close(X) icon on User Details form
Given Admin is on User details pop up
When Admin clicks Cancel/Close(X) Icon on User Details form
Then User Details popup window should be closed without saving

@ANU_09
Scenario: Validate Cancel button on User Details form
Given Admin is on User details pop up
When Admin clicks Cancel button 
Then Admin can see the User details popup disappears without adding any user

@ANU_10
Scenario: Check if the user details are added in data table
Given Admin is on User details pop up
When Fill in all the fields with valid values and click submit
Then The newly added user should be present in the data table in Manage User page

