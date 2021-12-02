package com.janbask.inheritanceExample;

//extends is a keyword used to establish relation between parent and child
public class Child extends Parent{
	
	
	public void Car() {
		
		System.out.println("Child owns a Car");
	}
	
	public void Gold() {
		
		System.out.println("Child owns Gold");
	}

	public static void main(String[] args) {
		
		
		Child c= new Child();
		c.Car();
		c.Gold();
		//these methods are coming from parent
		c.home();
		c.factory();
		

	}

}
