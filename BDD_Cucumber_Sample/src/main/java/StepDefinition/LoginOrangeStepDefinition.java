package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrangeStepDefinition {
	
	WebDriver driver;
	

	@Given("^I launch the Firefox Browser$")
	public void i_launch_the_Firefox_Browser() throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	    
	}

	@When("^I navigate to url$")
	public void i_navigate_to_url() throws Throwable {
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	}

	@When("^I enter the username$")
	public void i_enter_the_username() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  
	}

	@When("^I enter the password$")
	public void i_enter_the_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  
	}

	@Then("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		
		boolean actual=driver.findElement(By.xpath("//input[@id='Subscriber_link']")).isDisplayed();
		assertEquals(actual,true);
	   
	}



}
