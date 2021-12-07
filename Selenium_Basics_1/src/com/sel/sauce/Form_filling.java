package com.sel.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_filling {
	
	public static  String random_uname() {
		
   String[] alp= {"a","b","c","d","2","3","12","v","z","3","t","y","r"};
 		
		int num;
		
		String value = "";
		for( int i=0;i<5;i++) 
		{
		num= (int) (Math.random()*10);
		
		//System.out.println(num);
		value=alp[num]+value;
	}
	
		return value;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String fname="Lee";
		  String lname="Con"; 
		  String Address="24 central sydney"; 
		  String city="sydney";
		  String state=" Aus";
		  String pin ="4178"; 
		  String phone="4123456";
		  String SSN="78856";
		  String Uname=random_uname();
		  String pwd="pwd123"; 
		  String confirm="pwd123";
		  
		

		System.setProperty("webdriver.chrome.driver", "D:\\JANBASK\\NOV WEEKDAY BATCH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		
		 
		  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(fname);
		  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lname);
		  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(Address);
		  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
		  driver.findElement(By.xpath(" //input[@id='customer.address.state']")).sendKeys(state);
		  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(pin);
		  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phone);
		  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(SSN);
		  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(Uname); 
		 
		
		  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(pwd);
		  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(confirm);
		  driver.findElement(By.xpath("//input[@value='Register']")).click();

	}

}
