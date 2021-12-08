package com.sel.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);


		

		WebElement trialaction = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Thread.sleep(3000);

		a.doubleClick(trialaction).perform();
		
	
		
		
		

	}

}
