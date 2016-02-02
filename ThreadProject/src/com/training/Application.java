package com.training;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread obj = new MyThread();
		
		obj.setName("XYZ");
		
		obj.start();

	}

}
