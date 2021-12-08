package com.sel.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();

	}

}
