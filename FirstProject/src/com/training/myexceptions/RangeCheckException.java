package com.training.myexceptions;


//Inheritance
//Checked Exception - Because extending Exception
public class RangeCheckException extends Exception {
	
	private long handPhone;

	public RangeCheckException(long handPhone) {
		super();
		this.handPhone = handPhone;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return handPhone + " should be 10 digit number";
	}
	
	

}
