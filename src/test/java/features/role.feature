@role
Feature: Role creation

  Background: 
    Given admin is in bank home page
    And admin do login with valid credentials
    And admin clicks on roles button
    And admin clicks on new role button

	@valid
  Scenario: role creation with valid data
    When admin fills role name
    And admin selects role type
    And admin clicks on submit button
    Then admin can see an alert message saying role created successfully

	@invalid
  Scenario: role creation with invalid role name
    When admin fills invalid role name
    Then admin can see an error messag
