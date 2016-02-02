package ques2;

public class Periodicals extends MediaTypes {
	
	String iSBNNum;
	String subject;
	String volNum;
	String rating;
	public Periodicals() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Periodicals(String title, String author,String iSBNNum, String subject, String volNum, String rating) {
		super(title, author);
		this.iSBNNum = iSBNNum;
		this.subject = subject;
		this.volNum = volNum;
		this.rating = rating;
	}
	public String getiSBNNum() {
		return iSBNNum;
	}
	public void setiSBNNum(String iSBNNum) {
		this.iSBNNum = iSBNNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getVolNum() {
		return volNum;
	}
	public void setVolNum(String volNum) {
		this.volNum = volNum;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void displayDetails()
	{
		System.out.println("The details for Periodicals are:-");
		System.out.println("Title : " +title);
		System.out.println("Author : " +author);
		System.out.println("ISBN Number : " +iSBNNum);
		System.out.println("Subject : " + subject);
		System.out.println("Volume Number : " + volNum);
		System.out.println("Rating : " + rating);
	
	}
	

}
