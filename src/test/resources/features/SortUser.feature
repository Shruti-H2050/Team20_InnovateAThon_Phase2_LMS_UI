Feature: Sort User


Background:
	Given  Admin is on dashboard page after Login and clicks User on the navigation bar


  @SU_01
  Scenario: Sort user by id
    Given Admin is on Manage User Page
    When Admin clicks on ID sort icon
    Then Admin should see User details are sorted by id

  @SU_02
  Scenario: Sort user by name
    Given Admin is on Manage User Page
    When Admin clicks on name sort icon
    Then Admin should see User details are sorted by name

  @SU_03
  Scenario: Sort user by Location
    Given Admin is on Manage User Page
    When Admin clicks on Location sort icon
    Then Admin should see User details are sorted by Location

  @SU_04
  Scenario: Sort user by Phone number
    Given Admin is on Manage User Page
    When Admin clicks on Phone number sort icon
    Then Admin should see User details are sorted by Phone number
