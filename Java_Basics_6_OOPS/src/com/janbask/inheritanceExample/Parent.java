package com.janbask.inheritanceExample;

public class Parent {
	
	
	public void home() {
		
		System.out.println("Parent owns home");
	}
	
	
	public void factory() {
		
		System.out.println("Parent owns factory");
	}
	
	
	public static void main(String[] args) {
		
		
		//classname objectname= new classname
		
		
		Parent p = new Parent();
		p.home();
		p.factory();
		
		
		
	}

}
