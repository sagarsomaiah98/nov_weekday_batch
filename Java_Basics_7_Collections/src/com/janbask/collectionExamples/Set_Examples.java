package com.janbask.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Examples {

	public static void main(String[] args) {
		
		Set<String> colors= new HashSet<String>();
		
		colors.add("RED");
		colors.add("BLUE");
		colors.add("PINK");
		colors.add("GREEN");
		
		
		//System.out.println(colors.size());
		
		//retrieve values using iterator
		
		
		Iterator<String> it= colors.iterator();// pointers/iterators assigned to set
		
		/*
		 * System.out.println(it.next());
		 * 
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * System.out.println(it.hasNext()); System.out.println(it.next());
		 * System.out.println(it.hasNext()); System.out.println(it.next());//retrieve
		 * the current value and move to next item
		 * System.out.println(it.hasNext());//checks whether there is value after
		 */		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
		}
		
		
		

	}

}
