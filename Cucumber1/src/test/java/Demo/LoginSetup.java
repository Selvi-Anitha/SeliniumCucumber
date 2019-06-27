package Demo;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSetup {
	
	@Given("User enters UserName")
	public void user_enters_UserName() {
		System.out.println("username");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters password")
	public void user_enters_password() {
		System.out.println("password");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("Click on login button")
	public void click_on_login_button() {
		System.out.println("Click login");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Homepage is displayed");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
