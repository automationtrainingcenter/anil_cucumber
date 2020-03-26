package stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ebanking.cucumber_framework.pages.AdminHomePage;
import ebanking.cucumber_framework.pages.BankHomePage;
import ebanking.cucumber_framework.pages.RoleCreationPage;
import ebanking.cucumber_framework.pages.RoleDetailsPage;

public class RoleCreationsSteps {
	private WebDriver driver;
	private CommonSteps commonSteps;
	private RoleDetailsPage roleDetailsPage;
	private RoleCreationPage roleCreationPage;
	private Alert alert;
	
	
	public RoleCreationsSteps(CommonSteps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = this.commonSteps.getDriver();
	}
	
	@Given("admin do login with valid credentials")
	public void admin_do_login_with_valid_credentials() {
		BankHomePage bankHomePage = new BankHomePage(driver);
		bankHomePage.fillUsername("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLogin();
	}

	@Given("admin clicks on roles button")
	public void admin_clicks_on_roles_button() {
		AdminHomePage adminHomePage = PageFactory.initElements(driver, AdminHomePage.class);
		roleDetailsPage = adminHomePage.clickRoles();
	}

	@Given("admin clicks on new role button")
	public void admin_clicks_on_new_role_button() {
		roleCreationPage = roleDetailsPage.clickNewRole();
	}

	@When("admin fills role name")
	public void admin_fills_role_name() {
		roleCreationPage.fillRoleName("newroleone");
	}

	@When("admin selects role type")
	public void admin_selects_role_type() {
		roleCreationPage.selectRoleType("E");
	}

	@When("admin clicks on submit button")
	public void admin_clicks_on_submit_button() {
		alert = roleCreationPage.clickSubmit();
	}

	@Then("admin can see an alert message saying role created successfully")
	public void admin_can_see_an_alert_message_saying_role_created_successfully() {
		System.out.println("alert came");
	}

	@When("admin fills invalid role name")
	public void admin_fills_invalid_role_name() {
		roleCreationPage.fillRoleName("invalidRole!");
	}

	@Then("admin can see an error messag")
	public void admin_can_see_an_error_messag() {
		System.out.println("error message came");
	}

}
