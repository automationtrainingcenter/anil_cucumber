package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleCreationsSteps {
	@Given("admin do login with valid credentials")
	public void admin_do_login_with_valid_credentials() {
		System.out.println("logged in as admin");

	}

	@Given("admin clicks on roles button")
	public void admin_clicks_on_roles_button() {
		System.out.println("clicked on roles button");
	}

	@Given("admin clicks on new role button")
	public void admin_clicks_on_new_role_button() {
		System.out.println("clicked on new role button");
	}

	@When("admin fills role name")
	public void admin_fills_role_name() {
		System.out.println("filled role name");
	}

	@When("admin selects role type")
	public void admin_selects_role_type() {
		System.out.println("filled role type");
	}

	@When("admin clicks on submit button")
	public void admin_clicks_on_submit_button() {
		System.out.println("click on submit button");
	}

	@Then("admin can see an alert message saying role created successfully")
	public void admin_can_see_an_alert_message_saying_role_created_successfully() {
		System.out.println("alert came");
	}

	@When("admin fills invalid role name")
	public void admin_fills_invalid_role_name() {
		System.out.println("filled role name with invalid data");
	}

	@Then("admin can see an error messag")
	public void admin_can_see_an_error_messag() {
		System.out.println("error message came");
	}

}
