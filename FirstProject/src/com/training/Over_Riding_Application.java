package com.training;

public class Over_Riding_Application {

	public static void main(String[] args) {
		
		LifeInsurance ins1 = new LifeInsurance(122323,"SANDEEP","qtr",200000);
		LifeInsurance ins2 = new LifeInsurance(122323,"SANDEEP","qtr",200000);
		//LifeInsurance ins3=ins1;
		System.out.println("Exact Value"+ins1.equals(ins2));
		System.out.println("Identity"+ins1.equals(ins2));
		String s = new String("Hello");
		System.out.println("Diff Type"+ ins1.equals(s));
		
		
		

	}

}
