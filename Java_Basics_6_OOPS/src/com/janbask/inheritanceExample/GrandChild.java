package com.janbask.inheritanceExample;

public class GrandChild extends Child {
	
	
	public void bike() {
		
		
		System.out.println("GrandChild owns bike");
	}

	public static void main(String[] args) {
		
		GrandChild g= new GrandChild();
		
		g.bike();
		
		g.home();
		g.factory();
		g.Car();
		g.Gold();
		

	}

}
