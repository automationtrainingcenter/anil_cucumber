@login
Feature: admin login functionality

@valid @smoke
Scenario: login with valid credentials
	Given admin is in bank home page
	When admin enters valid username
	And admin enters valid password
	And admin clicks on login button
	Then admin can see welcome to admin message with logout link
	
@invalid 
Scenario: login with invalid username
	Given admin is in bank home page
	When admin enters invalid username
	And admin enters valid password
	And admin clicks on login button
	Then admin can see an error message saying incorrect bankname or password
