package com.sauce.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static FileInputStream fs ;
	public static Properties prop;
	
	public static WebDriver driver;
	
	public void intialize() throws IOException {
		
		
		
       fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG\\config.properties");
		
		prop= new Properties();
		
		prop.load(fs);
		
		String bname =prop.getProperty("BROWSER");
		
		if(bname.equals("CHROME"))
				{

			System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
			 driver= new ChromeDriver();
				}
		
		String url =prop.getProperty("URL");
		
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
	}

}
