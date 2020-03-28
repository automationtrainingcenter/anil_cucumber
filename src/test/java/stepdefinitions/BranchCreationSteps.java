package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebanking.cucumber_framework.pages.AdminHomePage;
import ebanking.cucumber_framework.pages.BranchCreationPage;
import ebanking.cucumber_framework.pages.BranchDetailsPage;

public class BranchCreationSteps {
	private WebDriver driver;
	private CommonSteps commonSteps;
	private BranchDetailsPage branchDetailsPage;
	private BranchCreationPage branchCreationPage;
	private Alert alert;
	
	
	public BranchCreationSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}
	
	
	@Given("admin clicks branches button")
	public void admin_clicks_branches_button() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		branchDetailsPage = adminHomePage.clickBranches();
	}

	@Given("admin clicks new branch button")
	public void admin_clicks_new_branch_button() {
		branchCreationPage = branchDetailsPage.clickNewBranch();
	}

	@When("admin enters branch name as {string}")
	public void admin_enters_branch_name_as(String branchName) {
		branchCreationPage.fillBranchName(branchName);
	}

	@When("admin enters address as {string}")
	public void admin_enters_address_as(String address) {
		branchCreationPage.fillAddress1(address);
	}

	@When("admin enters zipcode as {string}")
	public void admin_enters_zipcode_as(String zipcode) {
		branchCreationPage.fillZipcode(zipcode);
	}

	@When("admin selects country as {string}")
	public void admin_selects_country_as(String country) {
		branchCreationPage.selectCountry(country);
	}

	@When("admin selects state as {string}")
	public void admin_selects_state_as(String state) {
		branchCreationPage.selectState(state);
	}

	@When("admin selects city as {string}")
	public void admin_selects_city_as(String city) {
		branchCreationPage.selectCity(city);
	}

	@When("admin clicks on submit button in branch creation form")
	public void admin_clicks_on_submit_button_in_branch_creation_form() {
		alert = branchCreationPage.clickSubmit();
	}

	@Then("admin can see an alert message saying branch created successfully")
	public void admin_can_see_an_alert_message_saying_branch_created_successfully() {
		String alertText = alert.getText();
		alert.accept();
		Assert.assertTrue(alertText.toLowerCase().contains("new branch"));
	}

}
