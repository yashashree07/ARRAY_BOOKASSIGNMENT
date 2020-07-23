package com.montran.pojo;

public class Book {

	
	private int bookID;
	private String bookName;
	private double price;
	private static int bookNo=101;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookID, String bookName, double price) {
		super();
		this.bookID = bookNo;
		this.bookName = bookName;
		this.price = price;
		bookNo++;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	
}
