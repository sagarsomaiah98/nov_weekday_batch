package com.janbask.exceptionExamples;

public class ArrayOutofboundExample {

	public static void main(String[] args) {
		int a[] = new int[5];
        a[10] = 9; 
        System.out.println(a[2]);
        
        System.out.println("program ended");
        System.out.println("next section of code");

	}

}
