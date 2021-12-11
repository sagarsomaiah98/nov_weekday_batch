package com.crm.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	 static FileInputStream fis;
	
	
	
	
	
	public static void intialization() throws IOException {
		
		prop=new Properties();//intialize
	     fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\crm\\config\\Config.properties");//path of configuration
			 
			 prop.load(fis);
		
			 System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
				
		 
		 System.setProperty("webdriver.gecko.driver","D:\\\\JANBASK\\NOV WEEKDAY BATCH\\geckodriver.exe");
		 
		
		 
		String bname= prop.getProperty("Browser");
		
		
		
         switch(bname){
		
		
		case  "chrome":
			 driver= new ChromeDriver();
		break;
		case  "firefox":
		driver = new FirefoxDriver();
		break;
		case  "edge":
		driver=new  EdgeDriver();
		break;
		default:
			System.out.println("invalid browser");
			
		
		}
         
         String url= prop.getProperty("url");
		 
         driver.get(url);
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		
	}
	

}
