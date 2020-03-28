$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/branch.feature");
formatter.feature({
  "name": "branch creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@branch"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "admin is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.admin_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks branches button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_clicks_branches_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks new branch button",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_clicks_new_branch_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@branch"
    },
    {
      "name": "@valid"
    },
    {
      "name": "@dd_single"
    }
  ]
});
formatter.step({
  "name": "admin enters branch name as \"testBranch\"",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_branch_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin enters address as \"ligampalli\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin enters zipcode as \"52100\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_zipcode_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin selects country as \"INDIA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_country_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin selects state as \"Delhi\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_state_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin selects city as \"Delhi\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_city_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on submit button in branch creation form",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_clicks_on_submit_button_in_branch_creation_form()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin can see an alert message saying branch created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BranchCreationSteps.admin_can_see_an_alert_message_saying_branch_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/employee.feature");
formatter.feature({
  "name": "Employee creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@empoloyee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "admin is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.admin_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on employee button",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeSteps.admin_clicks_on_employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on new employee button",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeSteps.admin_clicks_on_new_employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@empoloyee"
    },
    {
      "name": "@valid"
    },
    {
      "name": "@dd_datatable"
    }
  ]
});
formatter.step({
  "name": "admin fills employee form",
  "rows": [
    {
      "cells": [
        "empName",
        "pass",
        "roleType",
        "branchName"
      ]
    },
    {
      "cells": [
        "newEmployeeOne",
        "passwordOne",
        "newAdminRole",
        "testBranch"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "EmployeeSteps.admin_fills_employee_form(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "EmployeeSteps.admin_clicks_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin can see an alert message saying employee created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeSteps.admin_can_see_an_alert_message_saying_employee_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "admin login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@valid"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "admin is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.admin_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.admin_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin enters valid password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.admin_enters_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.admin_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin can see welcome to admin message with logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.admin_can_see_welcome_to_admin_message_with_logout_link()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:87)\n\tat org.junit.Assert.assertTrue(Assert.java:42)\n\tat org.junit.Assert.assertTrue(Assert.java:53)\n\tat stepdefinitions.LoginSteps.admin_can_see_welcome_to_admin_message_with_logout_link(LoginSteps.java:49)\n\tat ✽.admin can see welcome to admin message with logout link(file:src/test/java/features/login.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/role.feature");
formatter.feature({
  "name": "Role creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@role"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "admin is in bank home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.admin_is_in_bank_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin do login with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_do_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on roles button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_clicks_on_roles_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on new role button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_clicks_on_new_role_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "role creation with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@role"
    },
    {
      "name": "@valid"
    }
  ]
});
formatter.step({
  "name": "admin fills role name",
  "keyword": "When "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_fills_role_name()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin selects role type",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_selects_role_type()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "admin can see an alert message saying role created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RoleCreationsSteps.admin_can_see_an_alert_message_saying_role_created_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});