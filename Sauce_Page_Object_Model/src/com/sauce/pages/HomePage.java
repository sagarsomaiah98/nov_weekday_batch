package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.util.TestBase;

public class HomePage extends TestBase {
	
	public WebElement addTocart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	

	
	
	public void addTocart() {
		
		addTocart.click();
		
		
		
	}
	
	
}
