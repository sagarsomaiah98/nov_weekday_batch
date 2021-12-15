package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	public WebDriver driver;
	
	
	@Given("^I launch the chome browser$")
	public void i_launch_the_chome_browser() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	  
	}

	@When("^I enter the url$")
	public void i_enter_the_url() throws Throwable {
		
		driver.get("https://www.saucedemo.com/");
	   
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password() throws Throwable {
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		 
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	  
	}
	
	
	@When("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
	    
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(arg1);
		 
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
	}
	

	@When("^I click login$")
	public void i_click_login() throws Throwable {
		 driver.findElement(By.xpath("//input[@id='login-button']")).click();
		   Thread.sleep(3000);
	   
	}

	@Then("^I am logged in successfully$")
	public void i_am_logged_in_successfully() throws Throwable {
		
		driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']")).isDisplayed();
	    
	}
	
	
	@Then("^I click on add to cart$")
	public void i_click_on_add_to_cart() throws Throwable {
	   
	}

	@Then("^item is added to cart successfully$")
	public void item_is_added_to_cart_successfully() throws Throwable {
	   
	}


}
