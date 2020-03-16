@branch
Feature: branch creation

  Background: 
    Given admin is in bank home page
    And admin do login with valid credentials
    And admin clicks branches button
    And admin clicks new branch button

  @valid @dd_single
  Scenario: 
    When admin enters branch name as "testBranch"
    And admin enters address as "ligampalli"
    And admin enters zipcode as "52100"
    And admin selects country as "INDIA"
    And admin selects state as "Delhi"
    And admin selects city as "Delhi"
    And admin clicks on submit button in branch creation form
    Then admin can see an alert message saying branch created successfully

  @dd_multi
  Scenario Outline: 
    When admin enters branch name as "<branchName>"
    And admin enters address as "<address>"
    And admin enters zipcode as "<zip>"
    And admin selects country as "<country>"
    And admin selects state as "<state>"
    And admin selects city as "<city>"
    And admin clicks on submit button in branch creation form
    Then admin can see an alert message saying branch created successfully

    Examples: 
      | branchName      | address     | zip   | country | state | city |
      | testBranchOne   | lingampalli | 50050 | INDIA   | GOA   | GOA  |
      | testBranchTwo   | lingampalli | 50050 | INDIA   | GOA   | GOA  |
      | testBranchThree | lingampalli | 50050 | INDIA   | GOA   | GOA  |
