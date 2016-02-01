package ques3;

import java.util.Scanner;

public class RentalApplication {

	public static void main(String[] args) {
		
		ChennaiRentals cr = new ChennaiRentals();
		Items i =null;
		int key=0;
		int days=0;
		int quantity=0;
		
		
		Scanner s = new Scanner(System.in);
		
	do{
		System.out.println("Enter the serial number:");
		System.out.println("1. Fan");
		System.out.println("2. Furnitures");
		System.out.println("3. AC");
		System.out.println("4. Vessels");
		System.out.println("5. Exit");
		key= s.nextInt();
		System.out.println("Enter the no of days:");
		days=s.nextInt();
		System.out.println("Enter the quantity of item required:");
		quantity=s.nextInt();
		
		
		if(key<4){
			i= cr.getSerialNum(key);
			cr.printDetails(i,days,quantity);
		}
		else if(key== 5)
			System.out.print("Thanks for visiting!");
		else
			System.out.println("Invalid choice!");
		}while(key<=5);
		
	
		
		
	s.close();
	}

}
