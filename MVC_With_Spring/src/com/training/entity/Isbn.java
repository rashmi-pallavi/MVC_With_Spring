package com.training.entity;

public class Isbn {
	
	private long intlCode;
	private long bookCode;
	private String category;
	public Isbn() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Isbn(long intlCode, long bookCode, String category) {
		super();
		this.intlCode = intlCode;
		this.bookCode = bookCode;
		this.category = category;
	}
	public long getIntlCode() {
		return intlCode;
	}
	public void setIntlCode(long intlCode) {
		this.intlCode = intlCode;
	}
	public long getBookCode() {
		return bookCode;
	}
	public void setBookCode(long bookCode) {
		this.bookCode = bookCode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Isbn [intlCode=" + intlCode + ", bookCode=" + bookCode + ", category=" + category + "]";
	}
	
	
	

}
