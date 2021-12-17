import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Examples {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		js.executeScript("document.getElementById('txtPassword').value='admin123';");
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		System.out.println("done");
		js.executeScript("document.getElementById('btnLogin').click();");
		
		
		
		//js.executeScript("alert('enter correct login credentials to continue');");
		

	}

}
