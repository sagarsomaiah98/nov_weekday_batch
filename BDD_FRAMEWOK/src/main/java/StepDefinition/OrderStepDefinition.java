package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderStepDefinition  extends TestBase{
	
	@When("^I add the item to the cart$")
	public void i_add_the_item_to_the_cart() throws Throwable {
		 
		   driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();//add to cart
		  
	}

	@When("^I click cart$")
	public void i_click_cart() throws Throwable {
		 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();//click on cart
	   
	}

	@When("^I click checkout$")
	public void i_click_checkout() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	   
	}

	@When("^I enter the details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_the_details(String arg1, String arg2, String arg3) throws Throwable {
		
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Henry");
		driver.findElement(By.xpath(" //input[@id='last-name']")).sendKeys("Ken");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
	    
	}

	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
		driver.findElement(By.xpath(" //input[@id='continue']")).click();
	   
	}

	@When("^I verify total value$")
	public void i_verify_total_value() throws Throwable {
		
		String actual=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
		
		assertEquals(actual, "$29.99");
	   
	}

	@When("^I click Finish$")
	public void i_click_Finish() throws Throwable {
		driver.findElement(By.xpath("//button[@id='finish']")).click();

	    
	}

	@When("^I verify the order$")
	public void i_verify_the_order() throws Throwable {
		String actual=	driver.findElement(By.xpath(" //h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).getText();
		
		assertEquals(actual, "THANK YOU FOR YOUR ORDER");
		
		TestUtil.Screenshot();
		
		Thread.sleep(2000);
	   
	}

	@Then("^I navigate to home page$")
	public void i_navigate_to_home_page() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		
		
	
		
	   
	}


}
