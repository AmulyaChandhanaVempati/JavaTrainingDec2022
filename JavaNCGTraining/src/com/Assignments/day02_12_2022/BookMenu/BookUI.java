package com.Assignments.day02_12_2022.BookMenu;

import java.util.Scanner;

public class BookUI {
	static Scanner sc = new Scanner(System.in);
	static BookService bookService = new BookService();

	public static void main(String[] args) {

		int option, bookid;
		String booktitle, bookauthor, bookpublisher;
		while (true) {
			option = mainMenu();
			switch (option) {
			case 1:
				System.out.println(bookService.addBook(addBookUI()));
				break;
			case 2:
				bookid = getBookIdUI("Modify ");
				System.out.println(bookService.modifyBook(modifyBookUI(bookid)));
				break;
			case 3:
				bookid = getBookIdUI("Delete ");
				System.out.println(bookService.deleteBook(bookid));
				break;
			case 4:
				bookid = getBookIdUI("");
				displayBookDetails(bookService.findBookById(bookid));
				break;
			case 5:
				booktitle = getBookTitleUI();
				displayBookDetails(bookService.findBookByTitle(booktitle));
				break;
			case 6:
				bookauthor = getBookAuthorUI();
				displayBookDetails(bookService.findBookByAuthor(bookauthor));
				break;
			case 7:
				bookpublisher = getBookPublisherUI();
				displayBookDetails(bookService.findBookByPublisher(bookpublisher));
				break;
			case 8:
				displayAllBooksUI(bookService.getAllBooks());
				break;
			case 9:
				System.exit(1);
			default:
				System.out.println("Invalid Option .....Please Enter valid option");
			}

		}

	}

	public static int mainMenu() {
		System.out.println("\n");
		System.out.println("1. Add Book ");
		System.out.println("2. Modify Book");
		System.out.println("3. Delete Book");
		System.out.println("4. Find Book By ID");
		System.out.println("5. Find Book By Title");
		System.out.println("6. Find Books By Author");
		System.out.println("7. Find Books By Publisher");
		System.out.println("8. Display All Books");
		System.out.println("9. E X I T ");
		System.out.print("Enter your option........");
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	private static Book addBookUI() {
		System.out.print("Enter Book Id ");
		int bookid = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book Title: ");
		String booktitle = sc.nextLine();
		System.out.print("Enter Book Author: ");
		String bookauthor = sc.nextLine();
		System.out.print("Enter Book Publisher: ");
		String bookpublisher = sc.nextLine();
		System.out.print("Enter Book Price: ");
		int bookprice = sc.nextInt();
		System.out.println("\n");
		return new Book(bookid, booktitle, bookauthor, bookpublisher, bookprice);
	}

	public static int getBookIdUI(String purpose) {
		System.out.print("Enter Book Id to " + purpose + "  ");
		int bookid = sc.nextInt();
		sc.nextLine();
		return bookid;
	}

	public static String getBookTitleUI() {
		System.out.print("Enter Book  Title");
		String booktitle = sc.nextLine();
		return booktitle;
	}

	public static String getBookAuthorUI() {
		System.out.print("Enter Book Author");
		String bookauthor = sc.nextLine();
		return bookauthor;
	}

	public static String getBookPublisherUI() {
		System.out.print("Enter Book Publisher");
		String bookpublisher = sc.nextLine();
		return bookpublisher;
	}

	public static Book modifyBookUI(int bookid) {

		Book currentbook = bookService.findBookById(bookid);
		String booktitle = currentbook.getBookTitle();
		String bookauthor = currentbook.getBookAuthorName();
		System.out.print("Enter Book Publisher: ");
		String bookpublisher = sc.nextLine();
		System.out.print("Enter Book Price: ");
		double bookprice = sc.nextDouble();
		System.out.println("\n");
		return new Book(bookid, booktitle, bookauthor, bookpublisher, bookprice);
	}

	public static void displayAllBooksUI(Book[] bookArray) {
		System.out.println("\n");
		for (Book b : bookArray)
			if (b != null)
				System.out.println(b.getBookId() + " " + b.getBookTitle() + " " + b.getBookAuthorName() + " "
						+ b.getBookPublisherName() + " " + b.getBookPrice());
		System.out.println("\n");
	}

	public static void displayBookDetails(Book book) {
		System.out.println();
		if (book != null) {
			System.out.println("Book Id:       " + book.getBookId());
			System.out.println("Book Title:       " + book.getBookTitle());
			System.out.println("Book Author:       " + book.getBookAuthorName());
			System.out.println("Book Publisher:    " + book.getBookPublisherName());
			System.out.println("Book Price:     " + book.getBookPrice());
		} else
			System.out.println("Book Does Not Exist\n");
	}

}
