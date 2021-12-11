package com.sauce.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.CartPage;
import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.util.TestBase;

public class AddTocartTest extends TestBase {


	@BeforeMethod
	public void intial() throws IOException {
		intialize();
		
	}
	
	@Test
	
	public void addTocart() {

		LoginPage l= new LoginPage();
		
		l.login("standard_user", "secret_sauce");
		
		HomePage cart= new HomePage();
		
		cart.addTocart();
		
		
		
	}
	
	
	@Test
	
	public void removeCart() {
		
      LoginPage l= new LoginPage();
		
		l.login("standard_user", "secret_sauce");
		
		HomePage cart= new HomePage();
		
		cart.addTocart();
		
		CartPage c = new CartPage();
		
		c.removeCart();
		
		
	}
}
