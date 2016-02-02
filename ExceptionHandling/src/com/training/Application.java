package com.training;

public class Application {
	
	public static void main(String[] args){
		
		Converter c = new Converter();
		
		double cel = c.farenToCelsius(32.00);
		System.out.println("Celsius value of 32F is:"+ cel);
		
		double cel2=0.0;
		try {
			Double faren=null;
			cel2 = c.farenToCelsius(faren);
			System.out.println("Celsius value of F is:"+ cel2);
		} catch (NullPointerException e) {
			System.out.println("Faren should not be null");
			System.out.println(e.getMessage());
		}
		System.out.println("Faren value is:"+cel2);
	}

}
