package StepDefintions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void intialize() {
		System.out.println("Intialize before hook method");
	}
	@After
	public void teardown() {
		System.out.println(" tear down after hook method ");
	}

}
