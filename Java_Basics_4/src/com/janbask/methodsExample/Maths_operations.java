package com.janbask.methodsExample;

public class Maths_operations {
	
	//create a method
	
	
	public void Addition()
	{
		//Addition of two numbers
		
		  int a=20; 
		  int b=30;
		  
		  int c=a+b;
		  
		  System.out.println("Addition of two numbers  "+a+"and"+b+" is "+c);	
		
		
	}
	
	
	//Access specifiers return_type method_name
	public void Subtraction(){
		//Subtraction of two numbers
		
				int m=100;
				
				int n=40;
				
				int l=m-n;
				
				System.out.println("Subtraction of two numbers  "+m+" and "+n+"is "+l);	
	}
	
	public void divide() {
		//local variables 
		int m=50;
		
		int n=0;
		
		int l=m/n;
		
		System.out.println("Subtraction of two numbers  "+m+" and "+n+"is "+l);	
		
		
		
	}
	

	public static void main(String[] args) { //head of the family
	//Create a object
		
	// how to create object?
	// Class_Name	objectname= new Class_Name
		Maths_operations math= new Maths_operations(); 
	   math.Addition();
		math.Subtraction();
		math.divide();
		
		
		
				
		
		

	}

}
