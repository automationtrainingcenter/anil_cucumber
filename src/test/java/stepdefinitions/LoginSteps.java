package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("admin is in bank home page")
	public void admin_is_in_bank_home_page() {
		System.out.println("launch browser");

	}

	@When("admin enters valid username")
	public void admin_enters_valid_username() {
		System.out.println("fill username");
	}

	@When("admin enters valid password")
	public void admin_enters_valid_password() {
		System.out.println("fill password");
	}

	@When("admin clicks on login button")
	public void admin_clicks_on_login_button() {
		System.out.println("click on login button");
	}

	@Then("admin can see welcome to admin message with logout link")
	public void admin_can_see_welcome_to_admin_message_with_logout_link() {
		System.out.println("logout link displayed");
	}

	@When("admin enters invalid username")
	public void admin_enters_invalid_username() {
		System.out.println("fill incorrect username");
	}

	@Then("admin can see an error message saying incorrect bankname or password")
	public void admin_can_see_an_error_message_saying_incorrect_bankname_or_password() {
		System.out.println("error message displayed");
	}
}
