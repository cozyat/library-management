package lib_mnge;

import java.util.*;
import java.util.Scanner;

public class Library {
	
	public static void main(String[] arg) {
		Book book1 = new Book("Harry Potter and the Prisoner of Azkaban", "Rowling, JK", "19781338815283", false);
		Book book2 = new Book("Fifty Shades of Grey", "James, EL", "9781728260891", true);
		Book book3 = new Book("To Kill a Mockingbird", "Lee, Harper", "9780060935467", false);
		Book book4 = new Book("The Giver", "Lowry, Lois", "9780544336261", true);
		Book book5 = new Book("The Honest Truth", "Gemeinhart, Dan", "9780545665742", true);
	
		List<Book> booklist = new ArrayList<Book>();
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);
		booklist.add(book5);
		
		System.out.println("Welcome to online library management service.");
		System.out.println("How can I help you today? | A: Check a book out | B: Exit");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		
		String userWelcome = sc.nextLine();
		
		if (userWelcome.equals("A")) {
			System.out.println("");
			System.out.println("You have chose to check a book out, please select from the list as shown below:");
			System.out.println("");
			System.out.println("");

			
			int count = 1;
			
			for (Book eachbook: booklist) {
				System.out.println(count + ". " + eachbook.bookTitle + " by " + eachbook.bookAuthor);
				System.out.println("");
				count++;
			}
		}
		
		else {
			System.out.println("Thank You! You have exited.");
			System.exit(0);
		}
		
		System.out.println("");
		System.out.println("Pick a book of your choice. (Type a number that corresponds to the book you wish to check out.)");
		System.out.println("");
		
		int userChoice = sc.nextInt();

		if (userChoice >= 1 && userChoice <= booklist.size()) {
		    Book selectedBook = booklist.get(userChoice - 1);
			System.out.println("");
		   
			selectedBook.doActionByBorrow();
			System.out.println("");
			selectedBook.giveBookInfo();
			
		    System.exit(0);
		}
		
		else {
		    System.out.println("Invalid selection. Please restart the system and choose a number from the list.");
		}

		
		sc.close();
	}
}