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
formatter.before({
  "status": "passed"
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
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@dd_multi"
    }
  ]
});
formatter.step({
  "name": "admin enters branch name as \"\u003cbranchName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "admin enters address as \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin enters zipcode as \"\u003czip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin selects country as \"\u003ccountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin selects state as \"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin selects city as \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "admin clicks on submit button in branch creation form",
  "keyword": "And "
});
formatter.step({
  "name": "admin can see an alert message saying branch created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "branchName",
        "address",
        "zip",
        "country",
        "state",
        "city"
      ]
    },
    {
      "cells": [
        "testBranchOne",
        "lingampalli",
        "50050",
        "INDIA",
        "GOA",
        "GOA"
      ]
    },
    {
      "cells": [
        "testBranchTwo",
        "lingampalli",
        "50050",
        "INDIA",
        "GOA",
        "GOA"
      ]
    },
    {
      "cells": [
        "testBranchThree",
        "lingampalli",
        "50050",
        "INDIA",
        "GOA",
        "GOA"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
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
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@branch"
    },
    {
      "name": "@dd_multi"
    }
  ]
});
formatter.step({
  "name": "admin enters branch name as \"testBranchOne\"",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_branch_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters address as \"lingampalli\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters zipcode as \"50050\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_zipcode_as(String)"
});
formatter.result({
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
formatter.step({
  "name": "admin selects state as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_state_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin selects city as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_city_as(String)"
});
formatter.result({
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
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
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
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@branch"
    },
    {
      "name": "@dd_multi"
    }
  ]
});
formatter.step({
  "name": "admin enters branch name as \"testBranchTwo\"",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_branch_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters address as \"lingampalli\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters zipcode as \"50050\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_zipcode_as(String)"
});
formatter.result({
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
formatter.step({
  "name": "admin selects state as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_state_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin selects city as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_city_as(String)"
});
formatter.result({
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
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
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
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@branch"
    },
    {
      "name": "@dd_multi"
    }
  ]
});
formatter.step({
  "name": "admin enters branch name as \"testBranchThree\"",
  "keyword": "When "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_branch_name_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters address as \"lingampalli\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin enters zipcode as \"50050\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_enters_zipcode_as(String)"
});
formatter.result({
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
formatter.step({
  "name": "admin selects state as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_state_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "admin selects city as \"GOA\"",
  "keyword": "And "
});
formatter.match({
  "location": "BranchCreationSteps.admin_selects_city_as(String)"
});
formatter.result({
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
formatter.after({
  "status": "passed"
});
});