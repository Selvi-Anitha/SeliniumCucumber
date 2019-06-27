package pack3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multipleSetup {
	
	@Given("I want to enter {string}")
	public void i_want_to_enter(String string) {
		
		System.out.println(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter {string}")
	public void i_enter(String string) {
		System.out.println(string);
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}

	@Then("the page is displayed")
	public void the_page_is_displayed() {
		System.out.println("page is displayed");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
