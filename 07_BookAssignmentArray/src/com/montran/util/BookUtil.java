package com.montran.util;

import com.montran.pojo.Book;


public class BookUtil {
	
	private Book books[];
	private int next_index=0;
	private int max_index;
	
	public BookUtil(int bookLength)
	{
		books = new Book[bookLength];
		max_index=bookLength;
	}
	
	public boolean addNewBook(Book book)			//add new book
	{
		if(next_index>=0 && next_index<max_index)
		{
			books[next_index]=book;
			return true;
		}
		next_index++;
		return false;
	
	}// end of addnewBook
	
	/*public boolean addAllBooks(Book books[]) {
		for (Book book : books) {
			addNewBook(book);
		}
		return true;
	}*/
	
	public boolean addAllBooks(Book allbooks[])		//add all books
	{
		
			if(next_index>=0 && next_index<max_index)
			{
				this.books[next_index]=books[next_index++];
				System.out.println("book");
				return true;
			}	
			//next_index++;
		
		
		return false;
	
	}//end of addallBooks*/
	
	public boolean updateBook(int newbookId, String newbookName, double newPrice) {
		for (Book book : books) {
			if (book.getBookID() == newbookId) {
				book.setBookName(newbookName);
				book.setPrice(newPrice);
				return true;
			}
		}
		return false;
	
	}//end of updateBook
	
	
	public int getNext_index() {
		return next_index;
	}

	public int getMax_index() {
		return max_index;
	}

	public boolean deleteBook(int bookid)		//delete book
	{
		for(int i=0;i<books.length;i++)
		{
			if(books[i].getBookID()==bookid)
			{
				for(int m=i;i<max_index-1;m++)
				{
					books[m]=books[m+1];
					return true;
				}
			}
		
		}
		return false;
	}//end of deleteBook
	
	
	public Book getBookByBookId(int bookId)
	{
		for(Book book : books)
		{
			if(book!=null)
			{
				if(book.getBookID()==bookId)
				return book;
			}
		}
		return null;
		
	}//end of getbookbybookid
	
	public Book[] getallBooks()			//get allbooks
	{
		return books;
	}//end of getallBooks
	
	

}
