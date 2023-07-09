package lib_mnge;

public class Book {

	String bookTitle;
	String bookAuthor;
	String bookISBN;
	boolean bookStatus;
	
	public Book(String bookTitle, String bookAuthor, String bookISBN, boolean bookStatus) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookISBN = bookISBN;
		this.bookStatus = bookStatus;
	}
	
	public void giveBookInfo() {
		System.out.println("Book Title: " + bookTitle);
		System.out.println("Book Author: " + bookAuthor);
		System.out.println("Book ISBN: " + bookISBN);
		System.out.println("Book Status: " + bookStatus);
	}
		
	public void doActionByBorrow() {
		System.out.println("You have borrowed " + bookTitle + ".");
		System.out.println("The due date for this book is due in 13 days.");
	}
}
