package com.janbask.methodOverloading;
//Method overloadin
//Java allows creation of methods with same name but different arguments/parameters
public class Addition {
	
	
	public void add(int a, int b) {
		int c=a+b;
		
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}
	
	
	public void add(double a, double b) {
		double k=a+b;
		
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+k);
	}
	
	public void add(int a, int b,int c) {
		int d=a+b+c;
		
		System.out.println("Adddition of three numbers "+a+" and "+b+" and "+c+" is "+d);
	}
	
	public void add(int a, int b,int c,int d) {
		int e=a+b+c+d;
		
		System.out.println("Adddition of three numbers "+a+" and "+b+" and "+c+" is "+d);
	}
	
	
	

	public static void main(String[] args) {
		
		
		Addition a= new Addition();
		
		a.add(20, 10);
		a.add(50, 10, 70);
		a.add(10.23, 21.45);
		

	}

}
