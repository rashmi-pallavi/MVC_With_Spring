package ques1;

import java.util.Scanner;

public class TaxApplication {

	public static void main(String[] args) {
		
		
	TaxWhiz tw = new TaxWhiz(5);
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the purchase amount: ");
	double purchase = s.nextDouble();
	System.out.println("The sales tax for the given purchase amount is : " + tw.calcTax(purchase));
	s.close();

	}

}
