package com.janbask.methodOverRiding;

//extends is a keyword used to establish relation between parent and child
public class Child extends Parent{
	
	

	
public void factory() {
	
	System.out.println("Child wants to modify the factory building");
}

	
	public void Car() {
		
		System.out.println("Child owns a Car");
	}
	
	public void Gold() {
		
		System.out.println("Child owns Gold");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.home();
		c.factory();
		
		
		
		

	}

}
