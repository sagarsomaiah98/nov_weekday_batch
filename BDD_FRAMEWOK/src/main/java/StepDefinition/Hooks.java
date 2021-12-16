package StepDefinition;

import com.sauce.testbase.TestBase;

import cucumber.api.java.After;

public class Hooks extends TestBase {
	
	@After
	public void teardown() {
		
		driver.quit();
	}

}
