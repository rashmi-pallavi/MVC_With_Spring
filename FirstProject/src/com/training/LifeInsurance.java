package com.training;

public class LifeInsurance {
	private long policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private double policyAmt;
	
	static{
		System.out.println("Static Block Called");
	}
	{
		System.out.println("Initialization Block Called");
	}
	
	
	public LifeInsurance() {
		super();
		System.out.println("Constructor called");
	}
	
	
	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode, double policyAmt) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
		this.policyAmt = policyAmt;
	}
	
	


	public LifeInsurance(long policyNumber, String policyHolderName, String paymentMode) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.paymentMode = paymentMode;
	}


	@Override
	public boolean equals(Object obj) {
		//Checking for Identity
		if(this == obj)
			return true;
		
		//Cautious
		if(obj == null) 
			return false;
		
		//Checking the type of object
		if(this.getClass()!=obj.getClass())
			return false;
		
		//casting
		LifeInsurance ins = (LifeInsurance)obj;
		
		return policyNumber == ins.policyNumber && policyHolderName.equals(ins.policyHolderName);
	}


	@Override
	public int hashCode() {
		
		long code = this.policyNumber + 7*policyNumber;
		return (int)code;
	}


	@Override
	public String toString() {
	
		return this.policyNumber + ":" + this.policyHolderName + ":" + this.paymentMode + ":" + this.policyAmt;
	}


	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getPolicyAmt() {
		return policyAmt;
	}
	public void setPolicyAmt(double policyAmt) {
		this.policyAmt = policyAmt;
	}
	
	public double calculatePremium()
	{
		
		return this.policyAmt*.10;
	}
	
	
	//Overloaded Method
	public double calculatePremium(double policyAmt){
		double amt = policyAmt*.20;
		return amt;
		
	}
}
	
	