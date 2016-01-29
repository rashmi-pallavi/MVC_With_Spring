package com.training;
import com.training.myexceptions.*;
public class Customer {
	
	private String custName;
	private int custContact;
	private int custAge;
	private long handPhone;
	
	public long getHandPhone() {
		return handPhone;
	}

	public void setHandPhone(long handPhone) {
		if(handPhone>9999999999L || handPhone<1111111111L)
		{
		
			try {
				throw new RangeCheckException(handPhone);
			} catch (RangeCheckException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		
		}
		else
		{
			this.handPhone = handPhone;
		}
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Customer(String custName, int custContact, int custAge, long handPhone) throws RangeCheckException {
		super();
		this.custName = custName;
		this.custContact = custContact;
		this.custAge = custAge;
		if(handPhone>9999999999L || handPhone<1111111111L)
		{
		
			throw new RangeCheckException(handPhone);
		
		}
		else
		{
			this.handPhone = handPhone;
		}
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public int getCustContact() {
		return custContact;
	}

	public void setCustContact(int custContact) {
		this.custContact = custContact;
	}

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	
	
	
	

}
