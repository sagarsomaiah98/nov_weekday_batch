import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.testandquiz.com/selenium/testing.html");
	
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
	Thread.sleep(3000);
	
	Alert al= driver.switchTo().alert();
	//al.accept(); //click ok
	al.dismiss(); //click cancel
		
		

	}

}
