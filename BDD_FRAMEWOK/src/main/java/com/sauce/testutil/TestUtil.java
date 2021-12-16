package com.sauce.testutil;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.sauce.testbase.TestBase;

public class TestUtil extends TestBase {
	
	public static   String getDate() {
		
		
		LocalDateTime myObj = LocalDateTime.now();
	    System.out.println(myObj);
	    
	    String dateTime=myObj.toString();
	    return dateTime;
	}
	
	public static void date_functions() {
		
		Date currentDate = new Date();  
        System.out.println("Current Date: "+currentDate);  
  
        String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr); 
		
	}
	
	
public  static void Screenshot() throws IOException {
		
		String name = driver.getTitle();;
		

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name + ".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
			
	}
	
	public static void main(String args[]) {
		//getDate();
		date_functions();
		
		
	}

}
