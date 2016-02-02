package ques4;

public class Employee {

	private String eName;
	private int eSalary;
	private String eSkill;
	

	public Employee(String eName, int eSalary, String eSkill) throws CheckSalaryException {
		super();
		this.eName = eName;
		this.eSkill = eSkill;
		if(this.eSkill== "unskilled" && eSalary<8500)
		{
			throw new CheckSalaryException(eSalary,"Salary should be greater than 8500");
		}
		else if(this.eSkill== "semiskilled" && eSalary<9500)
		{
			throw new CheckSalaryException(eSalary,"Salary should be greater than 9500");
		}
		else if(this.eSkill== "skilled" && eSalary<10500)
		{
			throw new CheckSalaryException(eSalary,"Salary should be greater than 10500");
		}
		else
			this.eSalary = eSalary;
	}


	public String displayDetails(){
		return eName +"\t"+  eSkill +"\t"+ eSalary;
	}
	
}
