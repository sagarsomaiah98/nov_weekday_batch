package com.janbask.collectionExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args) {
		
		
		List<String>  student_names= new ArrayList<String>();
		
		student_names.add("MARK");
		
		student_names.add("STEVE");
		student_names.add("JENNY");
		
		student_names.add("HENRY");
		student_names.add("KEVIN");
		student_names.add("ROY");
		
		System.out.println(student_names.size());
		
		int size= student_names.size();
		
		//System.out.println(student_names.get(5));
		
		for(int i=0;i<size;i++) {
			
			System.out.println(student_names.get(i));
		}
		

		
		
	}

}
