import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Login {
	
public void login(String uname, String pwd) throws InterruptedException {
	
	

   WebDriverManager.chromedriver().setup();	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(3000);
	driver.quit();

}
}
