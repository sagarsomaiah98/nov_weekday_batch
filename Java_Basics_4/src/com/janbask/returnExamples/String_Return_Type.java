package com.janbask.returnExamples;

public class String_Return_Type {
	
	
	public  String String_function() {
		
		//name="WELCOME TO";
		
		String place="USA";
		String job="Tester";
		String gender=" male";
		
		String color=" Red";
		
		
		color= color+place;// RedUSA
		job= place+gender;// USAmale
		place= job+color; // TesterRedUSA
		
		
		
		
		
		
		
		return place;
		
      

		
		
	}

	public static void main(String[] args) {
		
		String_Return_Type jack= new String_Return_Type();
		
		String a=jack.String_function();
		System.out.println(a);
		
		
		
		
		

	}

}
