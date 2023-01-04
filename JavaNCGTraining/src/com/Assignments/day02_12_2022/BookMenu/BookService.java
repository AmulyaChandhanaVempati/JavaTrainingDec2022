package com.Assignments.day02_12_2022.BookMenu;

import EmployeeMenu.Employee;

public class BookService {
	BookStore bookStore = new BookStore(2);

	public String addBook(Book book) {
		String message = "Book Could Not be Added";
		if (bookStore.addBook(book)) {
			message = "Book Added Successfully";
		}
		return message;
	}

	public String modifyBook(Book book) {
		String message = "Book Could Not be Modified";
		if (bookStore.modifyBook(book))
			message = "Book Modified Successfully";
		return message;
	}

	public String deleteBook(int bookid) {
		String message = "Book Could Not be Deleted";
		if (bookStore.deleteBook(bookid))
			message = "Book Deleted Successfully";
		return message;
	}

	public Book[] getAllBooks() {
		return bookStore.getAllBooks();
	}

	public Book findBookById(int bookid) {
		return bookStore.findBookById(bookid);
	}

	public Book findBookByTitle(String booktitle) {
		return bookStore.findBookByTitle(booktitle);
	}

	public Book findBookByAuthor(String bookauthor) {
		return bookStore.findBookByAuthor(bookauthor);
	}

	public Book findBookByPublisher(String bookauthor) {
		return bookStore.findBookByPublisher(bookauthor);
	}

}
