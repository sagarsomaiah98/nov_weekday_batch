import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {
	
	
	public void addTocart(String uname, String pwd) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();	
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
			
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			
			Thread.sleep(3000);
			driver.quit();
	}

}
