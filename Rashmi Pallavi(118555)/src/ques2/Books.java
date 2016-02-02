package ques2;

public class Books extends MediaTypes {
	
	String iSBNNum;
	String subject;
	int volNum;
	int rating;
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public Books(String title, String author,String iSBNNum, String subject, int volNum, int rating) {
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


	public int getVolNum() {
		return volNum;
	}


	public void setVolNum(int volNum) {
		this.volNum = volNum;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public void displayDetails()
	{	
		System.out.println("Details for Books are :-");
		System.out.println("Title : " + title);
		System.out.println("Author : " +author);
		System.out.println("ISBN Number : " + iSBNNum);
		System.out.println("Subject : " + subject);
		System.out.println("Volume Number : " + volNum);
		System.out.println("Rating : " + rating);
		
	}

}
