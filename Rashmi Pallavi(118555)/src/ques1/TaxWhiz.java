package ques1;

public class TaxWhiz {
	
	private int currentRate;

	public TaxWhiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxWhiz(int currentRate) {
		super();
		this.currentRate = currentRate;
	}
	
	
	
	public int getCurrentRate() {
		return currentRate;
	}

	public void setCurrentRate(int currentRate) {
		this.currentRate = currentRate;
	}

	public double calcTax(double purchase){
		
	double salesTax = purchase * currentRate;
	return salesTax;
	}
	

}
