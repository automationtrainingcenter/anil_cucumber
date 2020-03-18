@empoloyee
Feature: Employee creation

  Background: 
    Given admin is in bank home page
    And admin do login with valid credentials
    And admin clicks on employee button
    And admin clicks on new employee button

	@dd_datatable
  Scenario: 
    When admin fills employee form
      | empName        | pass        | roleType     | branchName |
      | newEmployeeOne | passwordOne | newAdminRole | testBranch |
    And admin clicks submit button
    Then admin can see an alert message saying employee created successfully
  
  @dd_json
  Scenario:
  	When admin clicks reset button after filling employee form by taking data from json file "employee.json"
  	Then admin can see an empty form