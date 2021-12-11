package com.sauce.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends TestBase {
	
	
	public static void screenshots() throws IOException {
		
		
		String name = driver.getTitle();

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

		File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

		FileUtils.copyFile(SrcFile, DestFile);
	}

}
