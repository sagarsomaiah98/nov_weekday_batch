package com.janbask.methodsExample;

public class Addition {
	//methods with parameters/arguments
	public void Add(int a, int b)
	{
		//Addition of two numbers
		
		 
		  
		  int c=a+b;
		  
		  System.out.println("Addition of two numbers  "+a+" and "+b+" is "+c);	
		
		
	}
	
	public void Subtract(double c, double d) {
		
		
		
		
		
		double l=c-d;
		
		System.out.println("Subtraction of two numbers  "+c+" and "+d+"is "+l);	
}

	

	public static void main(String[] args) {
	
		Addition  mary= new Addition();
		
		/*
		 * add.Add(2,20); add.Add(60,40); add.Add(90,10); add.Add(10,20);
		 * add.Add(30,40);
		 */
		mary.Subtract(20.45, 10.30);
		mary.Subtract(56.12, 50.23);
		

	}

}
