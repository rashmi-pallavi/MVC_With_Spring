package com.training;

public class Application {

	public static void main(String[] args) {
		
		BookSerializer bs = new BookSerializer();
		/*Book b = new Book(123,"ABCD","XYZ",1200);
		
		String message= bs.serialize(b);
		
		if(message!= null)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("Error! Run the code again!");
		}*/
		
		Book b1 = (Book)bs.deSerialize();
		System.out.println(b1);
		System.out.println(b1.getPrice());

	}

}
