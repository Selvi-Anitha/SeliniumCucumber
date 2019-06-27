package pack2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class changeSetup {

	@Given("I enter password as {string}")
	public void i_enter_password_as(String string) {
		
		System.out.println(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@And("I enter confirm password as {string}")
	public void i_enter_confirm_password_as(String string) {
		System.out.println(string);
	    // Write code here that turns the phrase above into concrete actions
	   //throw new cucumber.api.PendingException();
	}

	@Then("The password is changed")
	public void the_password_is_changed() {
		System.out.println("changed");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	
	@Given("Click logout button")
	public void click_logout_button() {
		System.out.println("Logout");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Homepage is displayed");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	
	@Given("Customer name")
	public void customer_name() {
		System.out.println("enter cust name");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@And("click booking")
	public void click_booking() {
		System.out.println("Click booking");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("Ticket is booked")
	public void ticket_is_booked() {
		System.out.println("Booked");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
