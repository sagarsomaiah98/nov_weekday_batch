package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^I launch the chrome browser$")
	public void i_launch_the_chrome_browser() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
	  
	}

	@When("^I enter the url \"([^\"]*)\"$")
	public void i_enter_the_url(String arg1) throws Throwable {
		
		System.out.println("ENTER THE URL");
		
		driver.get(arg1);
	  
	}

	@When("^I enter the username \"([^\"]*)\"$")
	public void i_enter_the_username(String arg1) throws Throwable {
		
		System.out.println("ENTERED THE USERNAME");
		
		driver.findElement(By.xpath(" //input[@id='user-name']")).sendKeys(arg1);
	    
	}

	@When("^I enter the password \"([^\"]*)\"$")
	public void i_enter_the_password(String arg1) throws Throwable {
		System.out.println("ENTERED THE PASSWORD");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg1);
	   
	}

	@When("^I click submit$")
	public void i_click_submit() throws Throwable {
		System.out.println("CLICKED SUBMIT");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	  
	}

	@Then("^I am logged in successfully$")
	public void i_am_logged_in_successfully() throws Throwable {
	   System.out.println("LOGGED IN SUCESSFULLY");
	   
	   String Actual=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
	   
	   assertEquals(Actual, "PRODUCTS");
	}


	
	@Then("^I click menu$")
	public void i_click_menu() throws Throwable {
		
		System.out.println("CLICKED MENU");
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	   
	}

	@Then("^I click logout$")
	public void i_click_logout() throws Throwable {
		System.out.println("CLICKED LOGOUT BUTTON");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
	   
	}

	@Then("^I am logged out of the application$")
	public void i_am_logged_out_of_the_application() throws Throwable {
		System.out.println("LOGGED OUT OF THE APPLICATION");
		
		Thread.sleep(3000);
		
		boolean actual =driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
		
		System.out.println(actual);
		
		assertEquals(actual, true);
		
		
	  
	}
	
	
	
	@When("^I click AddToCart$")
	public void i_click_AddToCart() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	   
		Thread.sleep(3000);
	}

	@When("^I click on Cart$")
	public void i_click_on_Cart() throws Throwable {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	  
	}

	@When("^I click on Remove$")
	public void i_click_on_Remove() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
		Thread.sleep(3000);
	  
	}

	@When("^I click on Continue Shopping$")
	public void i_click_on_Continue_Shopping() throws Throwable {
		
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
		Thread.sleep(3000);
		
	   
	}

	@Then("^I am navigated to Home Page$")
	public void i_am_navigated_to_Home_Page() throws Throwable {
		 String Actual=driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
		   
		   assertEquals(Actual, "PRODUCTS");
	    
	}


}
