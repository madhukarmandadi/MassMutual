package com.massmutual.qa.stepdefs;

import com.cg.exception.browserNotConfiguredException;
import com.massmutual.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValuesPageSteps extends TestBase {

	@Given("User launch browser")
	public void user_launch_browser() throws browserNotConfiguredException {
		
		TestBase.init();
	}

	@When("User navigates to home page")
	public void user_navigates_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate home page is displayed")
	public void validate_home_page_is_displayed() {
		
		
	}

	@When("User navigates to values page")
	public void user_navigates_to_values_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate values page displayed")
	public void validate_values_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User counts number of values")
	public void user_counts_number_of_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate values count should be greater than zero")
	public void validate_values_count_should_be_greater_than_zero() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate values count should be equal to {int}")
	public void validate_values_count_should_be_equal_to(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate values are displayed with currency sign")
	public void validate_values_are_displayed_with_currency_sign() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User perform addition on all the values")
	public void user_perform_addition_on_all_the_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate Total balance matches with addition of all the values")
	public void validate_total_balance_matches_with_addition_of_all_the_values() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
