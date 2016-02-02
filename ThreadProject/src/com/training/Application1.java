package com.training;

public class Application1 {

	public static void main(String[] args) {
		
		YourThread yt = new YourThread();
		
		Thread t1 = new Thread(yt,"Ram");
		
		Thread t2 = new Thread(yt,"Shyam");
		
		Thread t3 = new Thread(yt,"Ganesh");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
