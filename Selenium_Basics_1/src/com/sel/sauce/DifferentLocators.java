package com.sel.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");

		//driver.findElement(By.id("user-name")).sendKeys("Standard_user");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("Standarduser");
	}

}
