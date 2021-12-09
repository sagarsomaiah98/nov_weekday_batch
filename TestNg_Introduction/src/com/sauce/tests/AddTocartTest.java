package com.sauce.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddTocartTest {
	
	@Test
	public void addTocart() throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath(" //button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		String actual =driver.findElement(By.xpath(" //div[@class='inventory_item_name']")).getText();
		
		Thread.sleep(2000);
		assertEquals(actual, "Sauce Labs Backpack");
		
		driver.quit();
		
		
		
	}

}
