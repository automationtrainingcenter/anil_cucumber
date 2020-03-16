package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BranchCreationSteps {
	@Given("admin clicks branches button")
	public void admin_clicks_branches_button() {
		System.out.println("clicked on branches button");
	}

	@Given("admin clicks new branch button")
	public void admin_clicks_new_branch_button() {
		System.out.println("clicked on new branch button");
	}

	@When("admin enters branch name as {string}")
	public void admin_enters_branch_name_as(String branchName) {
		System.out.println("admin filled branchname with " + branchName);
	}

	@When("admin enters address as {string}")
	public void admin_enters_address_as(String address) {
		System.out.println("admin filled address with " + address);
	}

	@When("admin enters zipcode as {string}")
	public void admin_enters_zipcode_as(String zipcode) {
		System.out.println("admin fills zipcode with  " + zipcode);
	}

	@When("admin selects country as {string}")
	public void admin_selects_country_as(String country) {
		System.out.println("admin selects country as " + country);
	}

	@When("admin selects state as {string}")
	public void admin_selects_state_as(String state) {
		System.out.println("admin selects state as " + state);
	}

	@When("admin selects city as {string}")
	public void admin_selects_city_as(String city) {
		System.out.println("admin selects city as " + city);
	}

	@When("admin clicks on submit button in branch creation form")
	public void admin_clicks_on_submit_button_in_branch_creation_form() {
		System.out.println("admin clicks on submit button on branch creation form");
	}

	@Then("admin can see an alert message saying branch created successfully")
	public void admin_can_see_an_alert_message_saying_branch_created_successfully() {
		System.out.println("admin can see branch with some id");
	}

}
