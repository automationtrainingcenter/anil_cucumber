package stepdefinitions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebanking.cucumber_framework.pages.AdminHomePage;
import ebanking.cucumber_framework.pages.EmployeeCreationPage;
import ebanking.cucumber_framework.pages.EmployeeDetailsPage;
import gherkin.deps.com.google.gson.Gson;
import pojoclasses.EmployeeData;

public class EmployeeSteps {
	
	private WebDriver driver;
	private CommonSteps commonSteps;
	private EmployeeDetailsPage employeeDetailsPage;
	private EmployeeCreationPage employeeCreationpage;
	private Alert alert;
	
	
	public EmployeeSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}
	@Given("admin clicks on employee button")
	public void admin_clicks_on_employee_button() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		employeeDetailsPage = adminHomePage.clickEmployee();
	}

	@Given("admin clicks on new employee button")
	public void admin_clicks_on_new_employee_button() {
		employeeCreationpage = employeeDetailsPage.clickNewEmployee();
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
			employeeCreationpage.fillEmployeeName(row.get("empName"));
			employeeCreationpage.fillLoginPass(row.get("pass"));
			employeeCreationpage.selectRole(row.get("roleType"));
			employeeCreationpage.selectBranch(row.get("branchName"));
		}
		
		
	}

	@When("admin clicks submit button")
	public void admin_clicks_submit_button() {
		alert = employeeCreationpage.clickSubmit();
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
				employeeCreationpage.fillEmployeeName(employee.getEmployeeName());
				employeeCreationpage.fillLoginPass(employee.getPassword());
				employeeCreationpage.selectRole(employee.getRoleType());
				employeeCreationpage.selectBranch(employee.getBranchName());
				employeeCreationpage.clickReset();
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
