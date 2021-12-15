package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
   public static  Properties prop;
   
   public static WebDriver driver;

	
	
	public void initialize() throws IOException {
		
FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		
		prop= new Properties();
		
		prop.load(fis);
		
		
		String bname=prop.getProperty("BROWSER");
		
		switch(bname) {
		
		 case "CHROME": 
		WebDriverManager.chromedriver().setup(); 
		  driver= new  ChromeDriver(); 
		  break; 
		  case "FIREFOX":
		  WebDriverManager.firefoxdriver().setup(); 
		  driver = new FirefoxDriver();
		  break; case "EDGE":
		 WebDriverManager.edgedriver().setup(); 
		  driver =new EdgeDriver();
			  break; 
		  default:
			  System.out.println("invalid browser");
		
		}
		
		String url=prop.getProperty("URL");
		driver.manage().window().maximize();
		driver.get(url);
		
		}
		
	

}
