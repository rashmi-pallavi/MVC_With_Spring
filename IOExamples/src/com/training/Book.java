package com.training;

import java.io.Serializable;

public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 21L;
	private int bookNumber;
	private String bookName;
	private String author;
	private transient int price;
	
	
	public Book() {
		super();
		System.out.println("Book Initialized");
	}
	
	
	public Book(int bookNumber, String bookName,String author, int price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		
		return bookNumber+":"+ bookName+":"+price;
	}
	
	

}
