package StepDefintions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_StepDefinition {

	public WebDriver driver;
	
	@Given("Launch the browser and navigate to application")
	public void launch_the_browser_and_navigate_to_application() {
	   System.out.println("launch");
	   
	   WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
	  System.out.println("username and password");
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	  
	}
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(uname +"  -- "+pwd);
	    
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		  
	}

	@When("I click login")
	public void i_click_login() {
	  System.out.println("click login");
	  driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Given("I am running background test")
	public void i_am_running_background_test() {
	   System.out.println(" Running background");
	   //String title=driver.getTitle();
	  // System.out.println("title of page is  -"+title);
	   
	}
	
	@When("I close the browser")
	public void i_close_the_browser() {
	    driver.quit();
	}
	
	
	//*****************************
	
	

	@When("I select add to cart")
	public void i_select_add_to_cart() throws InterruptedException {
	   System.out.println("add to cart");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	   
	}
	@When("I click cart")
	public void i_click_cart() throws InterruptedException {
	   System.out.println("click cart");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	@When("I verify items added to cart")
	public void i_verify_items_added_to_cart() throws InterruptedException {
	   System.out.println("verify cart");
	   Thread.sleep(3000);
	  String cart_name= driver.findElement(By.xpath("//a/div[@class='inventory_item_name']")).getText();
	  System.out.println(cart_name);
	}

	@Given("I am on homepage")
	public void i_am_on_homepage() {
	    System.out.println("ALREADY ON HOMEPAGE");
	}

	@Given("I click logout button")
	public void i_click_logout_button() {
	System.out.println("CLICK LOGOUT BUTTON");
	}

	@Then("i am logged out")
	public void i_am_logged_out() {
	   System.out.println("LOGGED OUT");
	}


}
