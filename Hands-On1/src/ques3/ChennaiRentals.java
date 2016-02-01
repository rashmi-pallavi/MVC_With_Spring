package ques3;

public class ChennaiRentals {
	
	public Items getSerialNum(int key){
		
		switch(key)
		{
		case 1:
			return new Fan();
		case 2:
			return new Furnitures();
		case 3:
			return new AC();
		case 4:
			return new Vessels();
		default:
			return null;
		}
		
		
		}
	public void printDetails(Items item,int days,int quantity){
		System.out.println("Details are:");
		System.out.println("Serial Number:"+item.getSerialNum());
		System.out.println("Price:"+item.getPrice());
		System.out.println("Rental Charge:"+(item.getPrice() * days)/quantity);
	}

}
