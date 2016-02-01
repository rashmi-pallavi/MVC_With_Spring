package ques4;

public class EmployeeApplication {
	public static void main(String[] args){
		
		try{
			Employee em = new Employee("Ramesh", 2000, "skilled");
			System.out.println(em.displayDetails());
		}catch(CheckSalaryException c){
			System.out.println(c.getMessage());
						}
		
	}

}
