package stepdefinitions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.Gson;
import pojoclasses.EmployeeData;

public class EmployeeSteps {
	@Given("admin clicks on employee button")
	public void admin_clicks_on_employee_button() {
		System.out.println("clicked on employee button");
	}

	@Given("admin clicks on new employee button")
	public void admin_clicks_on_new_employee_button() {
		System.out.println("clicked on new employee button");
	}

	@When("admin fills employee form")
	public void admin_fills_employee_form(io.cucumber.datatable.DataTable dataTable) {
		/*
		 * single row and multiple columns -- List<String>
		 * multiple rows and multiple columns -- List<List<String>>
		 * single row or multiple rows and multiple columns with columns heading -- List<Map<String, String>>
		 */
//		List<String> row = dataTable.asList();
//		System.out.println("filling employee name "+row.get(0));
//		System.out.println("filling login password "+row.get(1));
//		System.out.println("selecting role type "+row.get(2));
//		System.out.println("selecting branch name "+row.get(3));
		
		List<Map<String, String>> rows = dataTable.asMaps();
		for(Map<String, String> row : rows) {
			System.out.println("filling employee name "+row.get("empName"));
			System.out.println("filling login password "+row.get("pass"));
			System.out.println("selecting role type "+row.get("roleType"));
			System.out.println("selecting branch name "+row.get("branchName"));
		}
		
		
	}

	@When("admin clicks submit button")
	public void admin_clicks_submit_button() {
		System.out.println("clicked on submit button");
	}

	@Then("admin can see an alert message saying employee created successfully")
	public void admin_can_see_an_alert_message_saying_employee_created_successfully() {
		System.out.println("got an alert saying employee created with some id");
	}
	
	@When("admin clicks reset button after filling employee form by taking data from json file {string}")
	public void admin_clicks_reset_button_after_filling_employee_form_by_taking_data_from_json_file(String fileName) {
		String filePath = System.getProperty("user.dir")+File.separator+"resources"+File.separator+fileName;
		try {
			FileReader reader = new FileReader(filePath);
			Gson gson = new Gson();
			EmployeeData[] employees = gson.fromJson(reader, EmployeeData[].class);
			for(EmployeeData employee : employees) {
				System.out.println("filling employee name "+employee.getEmployeeName());
				System.out.println("filling login pasword "+employee.getPassword());
				System.out.println("selecting role type "+employee.getRoleType());
				System.out.println("selecting branch name "+employee.getBranchName());
				System.out.println("clicking on reset button");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("admin can see an empty form")
	public void admin_can_see_an_empty_form() {
		System.out.println("displyed empty form");
	}

}
