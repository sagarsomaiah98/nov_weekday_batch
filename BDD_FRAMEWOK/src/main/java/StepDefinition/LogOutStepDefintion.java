package StepDefinition;

import org.openqa.selenium.By;

import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

import cucumber.api.java.en.Then;

public class LogOutStepDefintion extends TestBase{
	
	@Then("^I logOut$")
	public void i_logOut() throws Throwable {
		
		driver.findElement(By.xpath(" //button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
		TestUtil.Screenshot();
	    
		
		
	}

}
