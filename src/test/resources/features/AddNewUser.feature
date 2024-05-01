	Feature: Add New User
	
	Background:
	Given  Admin is on dashboard page after Login and clicks User on the navigation bar
	
	
	  @ANU_01
	  Scenario: Validate User Details Popup window
	    Given Admin is on Manage User Page
	    When Admin clicks "+ A New User" button
	    Then "Admin should see pop up open for user details with First Name,Middle name, Last Name, Location, phone, email, linkedin url, User Role, Role status, visa status,Undergraduate, postgraduate,time zone ,user comments and user fields along with Cancel , Submit and close buttons"
	
	  @ANU_02
	  Scenario: Validate input fields and text boxes in user details form
	    Given Admin is on Manage User Page
	    When Admin clicks "+ A New User" button
	    Then "Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments"
	
	  @ANU_03
	  Scenario: Validate drop downs in new user form
	    Given Admin is on Manage User Page
	    When Admin clicks "+ A New User" button
	    Then "Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up"
	
	  