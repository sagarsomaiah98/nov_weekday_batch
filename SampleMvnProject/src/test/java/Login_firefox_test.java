import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_firefox_test {
	
	
	@Test
	public void logintest() {
		
		
		
				
				WebDriverManager.firefoxdriver().setup();
				
				
				
				WebDriver driver = new FirefoxDriver();
				
				
				
				
				
				driver.manage().window().maximize();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				
			}

		}


