package com.training;

public class InsuranceManagerApplication {

	public static void main(String[] args) {
		
		LifeInsurance ins1 = new LifeInsurance(111,"sdsfe","sdds",450000);
		LifeInsurance ins2 = new LifeInsurance(111,"sdwfe","sqds",550000);
		LifeInsurance ins3 = new LifeInsurance(111,"sdefe","stds",650000);
		LifeInsurance ins4 = new LifeInsurance(111,"sdqfe","spds",750000);
		
		
		LifeInsurance[] list = new LifeInsurance[4];
		list[0] = ins1;
		list[1] = ins2;
		list[2] = ins3;
		list[3] = ins4;
		
		//InsuranceManager im = new InsuranceManager();
		//im.printPremiums(list);
		
		InsuranceManager.printPremiums(list);

	}

}
