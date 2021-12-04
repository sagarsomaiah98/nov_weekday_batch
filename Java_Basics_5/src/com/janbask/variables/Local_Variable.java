package com.janbask.variables;

public class Local_Variable {
	
	
	public void method1() {
		
		int a=30;
		String name="Kevin";
		
		
		System.out.println(a);
      System.out.println(name);		
		
	}
	
	
	public void method2() {
		
		int a=40;
		
		String name="Joy";
		
		System.out.println(a);
		System.out.println(name);
			
		
		
		
	}

	public static void main(String[] args) {
		
		
		Local_Variable l= new Local_Variable();
		
	l.method1();
	
	System.out.println("*************");
	l.method2();
	
		

	}

}
