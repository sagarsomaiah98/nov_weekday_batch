import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		/*
		 * d.get("https://www.bing.com"); d.get("https://www.google.com");
		 * d.get("https://janbask.com");
		 */
		
		/*
		 * d.navigate().to("https://www.bing.com"); d.navigate().back();
		 * d.navigate().forward(); d.navigate().refresh();
		 */
		
		
		d.get("https://www.saucedemo.com/");
		
		
		d.manage().window().maximize();
		
		//d.close();
		
		//or 
		d.quit();
		
		
		
		
		
		

	}

}
