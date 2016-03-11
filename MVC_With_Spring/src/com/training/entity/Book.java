package com.training.entity;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;


@Component
public class Book {
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	private long bookNumber;
	private String bookName;
	private String subject;
	private Isbn code;
	
	
	
	public Isbn getCode() {
		return code;
	}
	public void setCode(Isbn code) {
		this.code = code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		
		log.info("SetBookNumber called!");
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		log.info("SetBookName called!");
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
	}
	

}
