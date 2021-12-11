package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.util.TestBase;

public class CartPage extends TestBase {
	 public WebElement checkout =driver.findElement(By.xpath("//button[@id='checkout']"));
		
		public WebElement continue_shopping=driver.findElement(By.xpath(" //button[@id='continue-shopping']"));
		
		public WebElement remove_item=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		
		public WebElement item_name=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		
		public WebElement item_price=driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
		
		
	
		
		public void  removeCart() {
			
			remove_item.click();
		}

		
		public void checkout() {
			
			checkout.click();
		} 

}
