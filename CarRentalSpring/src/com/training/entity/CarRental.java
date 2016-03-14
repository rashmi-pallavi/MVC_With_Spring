package com.training.entity;

import org.springframework.stereotype.Component;

@Component
public class CarRental {
	
	private String name;
	private long mobileNumber;
	private String email;
	private String type;
	public CarRental() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CarRental [name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", type=" + type
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CarRental(String name, long mobileNumber, String email, String type) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.type = type;
	}
	
	

}
