import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Sync extends TestBase {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver.get("https://www.anthropologie.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		
		
		WebElement ele=driver.findElement(By.xpath(""));
		
		
		
		
		
		WebDriverWait wait= new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		

	}

}
