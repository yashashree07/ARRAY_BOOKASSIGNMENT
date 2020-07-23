package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Book;
import com.montran.util.BookUtil;

public class BookMainV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int bookid;
		String bookname;
		double bookprice;
		int userChoice;
		int noofBooks;
		boolean result;
		String continueChoice;
		BookUtil bookutil=new BookUtil(100);
		Book book;
		Book book1;
		Book allbooks[]=null;
		do
		{
			allbooks = bookutil.getallBooks();
			
			for (Book bookdisp : allbooks) {
				if (bookdisp != null) {
					
					
					System.out.println("-----------BookDetails--------\n");
					System.out.println("Book No\t BookTitle BookPrice \n" );
					System.out.println(bookdisp.getBookID() + " \t " + bookdisp.getBookName() + " \t " + bookdisp.getPrice());
					System.out.println("\n--------------------------------\n");
					
					
			
				}
			}	
			
			System.out.println("MENU");
			System.out.println("1..Add New Book");
			System.out.println("2..Add Multiple Books");
			System.out.println("3..Update Book");
			System.out.println("4..Delete Book");
			System.out.println("5..Print Single Book");
			System.out.println("6.Exit");
			System.out.println("Enter Choice");
			userChoice=sc.nextInt();
		
			switch (userChoice) {
			case 1://add new book
				//System.out.println("Enter Book ID :");
				//bookid=sc.nextInt();
				System.out.println("Enter Book Name :");
				bookname=sc.next();
				System.out.println("Enter Book Price");
				bookprice=sc.nextDouble();
				
				BookUtil bookutil1=new BookUtil(1);

				book1=new Book(0,bookname,bookprice);
				result=bookutil.addNewBook(book1);
				
				if(result)
				{
					System.out.println("Book added successfully");
				}
				else 
				{
					System.out.println("Failed to add book");
				}
			break;
			//end of case 1
			
			case 2://add multiple books
				System.out.println("Enter number of books");
				noofBooks=sc.nextInt();
			
				//Book book1=new Book[noofBooks];
				if (noofBooks < (bookutil.getMax_index() - bookutil.getNext_index()))
					{
						allbooks = new Book[noofBooks];
						for(int i=0;i<noofBooks;i++)
						{
							//System.out.println("Enter Book ID :");
							//bookid=sc.nextInt();
							System.out.println("Enter Book Name :");
							bookname=sc.next();
							System.out.println("Enter Book Price");
							bookprice=sc.nextDouble();
					
							book = new Book(0, bookname, bookprice);
							allbooks[i] = book;
							
						}
						
						bookutil.addAllBooks(allbooks);
						System.out.println(" All books added successfully");
						
						
					} 
					else
						System.out.println("No space");
						break;
					//end of case2
			
			case 3://update books	
				System.out.println("Enter BookID to Update : ");
				bookid=sc.nextInt();
				
				book=bookutil.getBookByBookId(bookid);
				//book.getBookID();
				if(book!=null)
				{
					//System.out.println(book);
					System.out.println("Enter new book name : ");
					bookname=sc.next();
					System.out.println("Enter new price :");
					bookprice=sc.nextDouble();
					result=bookutil.updateBook(bookid, bookname, bookprice);
					if(result)
						System.out.println("book updated");
					else
						System.out.println("book update failed");
				}
				else
					System.out.println("No book Found");
				
				break;
				//end of case3
			
			case 4://delete books
				System.out.println("Enter bookid to delete book");
				bookid=sc.nextInt();
				book=bookutil.getBookByBookId(bookid);
				if(book!=null)
				{
					result=bookutil.deleteBook(bookid);
					if(result)
					{
						System.out.println("Book deleted successfully");
					}
					else
					{
						System.out.println("Failed to delete the book");
					}
				}
				break;
			
			case 5://print single book
				System.out.println("Enter BookId : ");
				bookid = sc.nextInt();
				book = bookutil.getBookByBookId(bookid);
				if (book != null) {
					System.out.println(book);
				} else
					System.out.println("Book Not Found !!");
				break;
			
			case 6: //exit
					break;
			

			default:
				System.out.println("Invalid choice");
				break;
		}
		System.out.println("Do you want to continue : ");
		continueChoice=sc.next();
		
	}while(continueChoice.equals("yes"));
			
}

}


		
