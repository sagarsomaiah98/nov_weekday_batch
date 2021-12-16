package StepDefinition;

import org.openqa.selenium.By;

import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends TestBase {
	@Given("^Launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws Throwable {
		
		initialize();
	}
	  
		

	@When("^I enter the username \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
	public void i_enter_the_username_and_enter_the_password(String arg1, String arg2) throws Throwable {
	    driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys(arg1);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
		
	}

	@Then("^I click submit$")
	public void i_click_submit() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   
	   TestUtil.Screenshot();
	   Thread.sleep(3000);
	}







	
}
