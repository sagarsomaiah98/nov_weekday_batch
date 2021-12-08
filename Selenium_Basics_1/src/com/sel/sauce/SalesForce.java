package com.sel.sauce;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		
		
		
		
		driver.findElement(By.linkText("Privacy")).click();
		
Set<String>  wins=driver.getWindowHandles();
		
		System.out.println(wins.size());
		
		
		Iterator<String > it =wins.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		
	//	System.out.println(it.next());
	//	System.out.println(it.next());
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//span[contains(text(),'Learn more')]")).click();
		Thread.sleep(2000);
		
		//driver.close();

		driver.quit();
	}

}
