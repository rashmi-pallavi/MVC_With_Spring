package ques4;

public class CheckSalaryException extends Exception {
	
	private int eSalary;
	private String msg;

	public CheckSalaryException(int eSalary,String msg) {
		super();
		this.eSalary = eSalary;
		this.msg=msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}
	
	
	
	

}
