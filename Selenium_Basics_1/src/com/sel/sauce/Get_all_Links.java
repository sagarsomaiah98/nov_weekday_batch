package com.sel.sauce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_all_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
	List<WebElement> link=	driver.findElements(By.tagName("a"));
	
	System.out.println("number of links =="+link.size());
	
	
	for(int i=0;i<link.size();i++) {
		
		
		System.out.println(link.get(i).getText());
	}


	}

}
