#Feature: Add New Program Details
#
#Background: 
#Given Admin is on Manage Program Page after clicks Program on the navigation bar
#@addPgmDetailsTag1
#Scenario: Empty form submission
#Given Admin is on "Program Details" Popup window
#When Admin clicks <Save>button without entering any data
#Then Admin gets a Error message alert 
#@addPgmDetailsTag2
#Scenario: Enter only Program Name
#Given Admin is on "Program Details" Popup window
#When Admin enters only<Program Name> in text box and clicks Save button
#Then Admin gets a message alert 'Name is required'
#@addPgmDetailsTag3
#Scenario: Enter only Program Description
#Given Admin is on "Program Details" Popup window
#When Admin enters only<Program description> in text box and clicks Save button
#Then Admin gets a alert message 'Description is required'
#@addPgmDetailsTag4
#Scenario: Select status only
#Given Admin is on "Program Details" Popup window
#When Admin selects only Status and clicks Save button
#Then Admin gets a message alert with 'Name and Description required'
#@addPgmDetailsTag5
#Scenario: Validate invalid values on the text column
#Given Admin is on "Program Details" Popup window
#When Admin enters only numbers or special char in name and desc column
#Then Admin gets a Detailed Error message alert 
#@addPgmDetailsTag6
#Scenario: Validate Cancel/Close(X) icon on Program Details form
#Given Admin is on "Program Details" Popup window
#When Admin clicks Cancel/Close(X) Icon on Program Details form
#Then Program Details popup window should be closed without saving
#@addPgmDetailsTag7
#Scenario: Validate Save button on Program Details form
#Given Admin is on "Program Details" Popup window
#When Enter all the required fields with valid values and click Save button
#Then Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table
#@addPgmDetailsTag8
#Scenario: Validate Cancel button on Program Details form
#Given Admin is on "Program Details" Popup window
#When Admin clicks <Cancel>button 
#Then Admin can see the Program details popup disappears without creating any program