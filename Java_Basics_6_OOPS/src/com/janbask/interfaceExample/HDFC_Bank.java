package com.janbask.interfaceExample;

public class HDFC_Bank implements Central_Bank{
	
	
	

	public static void main(String[] args) {
		
		HDFC_Bank h= new HDFC_Bank();
		h.savings();
		h.creditcard();
		h.insurance();
		
	}


	public void savings() {
		System.out.println("HDFC banks savings minimum balance is 25000$");
	}

	
	public void creditcard() {
		System.out.println("HDFC credit card annual fee is 299$");
		
	}

	
	public void insurance() {
		System.out.println("HDFC insurance is free");
		
	}



	public void kyc() {
		
		
	}

}
