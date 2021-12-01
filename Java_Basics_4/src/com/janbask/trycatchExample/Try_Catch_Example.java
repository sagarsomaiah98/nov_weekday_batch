package com.janbask.trycatchExample;
public class Try_Catch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    String[] stud = new String[3];
		
		stud[0]="mark";
		stud[1]="steve";
		stud[2]="john";
		
	try {
		System.out.println(stud[10]);
	
	}
	
	catch(Exception e) {
		e.printStackTrace();
		
		System.out.println("failed to execute");
	}
	
	
	System.out.println(" end of the program");

	}
}