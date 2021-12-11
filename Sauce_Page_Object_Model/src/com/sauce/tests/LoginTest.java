package com.sauce.tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.util.TestBase;
import com.sauce.util.TestUtil;

public class LoginTest extends TestBase{
	
	@BeforeMethod
	public void intial() throws IOException {
		intialize();
		
	}
	
	@Test
	public void logintest() throws IOException {
		
		
		
		LoginPage l= new LoginPage();
		
		l.login("standard_user", "secret_sauce");
		TestUtil.screenshots();
		
		
		
	}
	
	@Test
	public void invalidlogintest() throws IOException {
		
      
		
		LoginPage l= new LoginPage();
		
		l.login("standar", "secret");
		
		TestUtil.screenshots();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
