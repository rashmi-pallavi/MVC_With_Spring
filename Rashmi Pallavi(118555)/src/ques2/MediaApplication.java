package ques2;

import java.util.Scanner;

public class MediaApplication {

	public static void main(String[] args) {
		
		MediaTypes[] mt = new MediaTypes[3];
		
		Books b = new Books("Introduction to IT","BS Ahuja","AABB","IT",1111,4);
		mt[0] =b;
		
		
		Periodicals p = new Periodicals("Business Management","ABCD","CCDD", "Business" , "22AA" ,"5");
		mt[1] = p;
		
		DVD d = new DVD("Wildlife","M Robinson",4,"AA11",2,5);
		mt[2] = d;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		System.out.println("1. Books ");
		System.out.println("2. Periodicals ");
		System.out.println("3. DVD ");
		System.out.println("Exit");
		int key = s.nextInt();
		switch(key){
		case 1:
			
			b.displayDetails();
			break;
		case 2:
			
			p.displayDetails();
			break;
		case 3:
			
			d.displayDetails();
			break;
		case 4:
			System.out.println("Exit");
			break;
		}
		
		s.close();
		
		
	}

}
