package com.janbask.returnExamples;

public class Return_Types {
	
	
	
	
	public  int print_age( int age) {
		
		
		//System.out.println(" my name is - "+name);
		
		//return name;
		
		age=age+10;//
		
		
		
		
		
		
		return age;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		//clasname objectname= new classname
		
		Return_Types marriana = new Return_Types();
		
		int a=marriana.print_age(60);
		
		if(a>60)
			
			System.out.println("Senior citizen");
		else
			
			System.out.println("not a senior citizen");
		
		
		
		
		
		
		

	}

}
