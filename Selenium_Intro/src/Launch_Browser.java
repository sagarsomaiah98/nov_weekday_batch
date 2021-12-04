import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
		
		//launch the chrome browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		//WebDriver d= new ChromeDriver();
		
		//launch the firefox browser
		
		System.setProperty("webdriver.gecko.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\geckodriver.exe");
		
		WebDriver d1= new FirefoxDriver();
		
		WebDriver d2= new EdgeDriver();
		WebDriver d3= new SafariDriver();
		
		
		
		

	}

}
