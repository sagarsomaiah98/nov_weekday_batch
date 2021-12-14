package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	
	
	@Given("^I launch the chome browser$")
	public void i_launch_the_chome_browser() throws Throwable {
		
		System.out.println("LAUNCH CHROME BROWSER");
	   
	}

	@When("^I enter the url$")
	public void i_enter_the_url() throws Throwable {
		
		System.out.println("ENTER THE URL");
	 
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password() throws Throwable {
		
		System.out.println("ENTER THE USERNAME AND ENTER THE PASSWORD");
	  
	}

	@When("^I click login$")
	public void i_click_login() throws Throwable {
		System.out.println("CLICK LOGIN");
	   
	}

	@Then("^I am logged in successfully$")
	public void i_am_logged_in_successfully() throws Throwable {
	  System.out.println("LOGGED IN SUCCESSFULLY");
	}

	
	@Then("^I click on add to cart$")
	public void i_click_on_add_to_cart() throws Throwable {
	   System.out.println("ADD ITEM TO CART");
	}

	@Then("^item is added to cart successfully$")
	public void item_is_added_to_cart_successfully() throws Throwable {
	   System.out.println("ITEM ADDED SUCCESSFULLY");
	}


}
