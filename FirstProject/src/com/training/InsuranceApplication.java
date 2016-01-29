package com.training;
import java.util.Scanner;

public class InsuranceApplication {

	public static void main(String[] args) {
		
		//Instance variable as a default value
		LifeInsurance lf = new LifeInsurance();
		lf.calculatePremium();
		
		//Using parameterized constructor
		LifeInsurance lf1 = new LifeInsurance(12345678,"ABC","ANNUAL",60000.00);
	    System.out.println(lf1.calculatePremium());
		 
		 
		 //Command line arguments
		 LifeInsurance lf2 = new LifeInsurance(Long.parseLong(args[0]),args[1],args[2],Double.parseDouble(args[3]));
		 System.out.println(lf2.calculatePremium());
		 
		 
		 //Using Scanner Class
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("Enter Policy Number:");
		 long policyNumber1 = s.nextLong();
		 
		 System.out.println("Enter Policy Holder Name:");
		 String policyHolder1 = s.next();
		 
		 System.out.println("Enter Payment Mode:");
		 String paymentMode1 = s.next();
		 
		 
		 
		 LifeInsurance lf3 = new LifeInsurance(policyNumber1,policyHolder1,paymentMode1);
		 System.out.println(lf3.calculatePremium(600.00));
		 
		 s.close();
		 
		 
		 

	
	}

}
