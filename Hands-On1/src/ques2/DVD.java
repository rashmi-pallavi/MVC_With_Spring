package ques2;

public class DVD extends MediaTypes{
	int runningTime;
	String volNum;
	int lendingLength;
	int rating;
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DVD(String title, String author,int runningTime, String volNum, int lendingLength, int rating) {
		super(title, author);
		this.runningTime = runningTime;
		this.volNum = volNum;
		this.lendingLength = lendingLength;
		this.rating = rating;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public String getVolNum() {
		return volNum;
	}
	public void setVolNum(String volNum) {
		this.volNum = volNum;
	}
	public int getLendingLength() {
		return lendingLength;
	}
	public void setLendingLength(int lendingLength) {
		this.lendingLength = lendingLength;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void displayDetails()
	{
		System.out.println("The details for Periodicals are:-");
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Running Time : " + runningTime);
		System.out.println("Volume Number : " + volNum);
		System.out.println("Lending Length : " + lendingLength);
		System.out.println("Rating : " + rating);
		
	}

}
