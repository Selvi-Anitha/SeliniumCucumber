package package4;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountDefinition {
	
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
		System.out.println("account creation");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
			System.out.println(list.get(i).get("status"));
		}
			
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
	}

	@Then("I verify the account")
	public void i_verify_the_account() {
		System.out.println("Verifying");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
