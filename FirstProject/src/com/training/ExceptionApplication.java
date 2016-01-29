package com.training;
import com.training.myexceptions.RangeCheckException;
public class ExceptionApplication {

	public static void main(String[] args) {
		
		try {
			Customer cust = new Customer("abc",5467787,21,123456789L);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
