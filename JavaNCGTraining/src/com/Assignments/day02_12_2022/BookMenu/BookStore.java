package com.Assignments.day02_12_2022.BookMenu;

import EmployeeMenu.Employee;

public class BookStore {

	private Book[] books;
	private int count = 0;

	public BookStore() {
		super();

	}

	public BookStore(int number) {
		books = new Book[number];
	}

	public boolean addBook(Book book) {
		if (count < books.length) {
			books[count] = new Book(book.getBookId(), book.getBookTitle(), book.getBookAuthorName(),
					book.getBookPublisherName(), book.getBookPrice());
			count++;
			return true;
		}
		return false;
	}

	public boolean modifyBook(Book book) {
		for (Book b : books) {
			if (b != null && b.getBookId() == book.getBookId()) {
				b.setBookPublisherName(book.getBookPublisherName());
				b.setBookPrice(book.getBookPrice());
				return true;
			}
		}
		return false;
	}

	public boolean deleteBook(int bookid) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookId() == bookid) {
				for (int j = i; j < count - 1; j++)
					books[j] = books[j + 1];
				count--;
				return true;
			}
		}
		return false;
	}

	public Book findBookById(int bookid) {
		for (int i = 0; i < count; i++) {
			if (books[i].getBookId() == bookid) {
				return books[i];
			}
		}
		return null;
	}

	public Book findBookByTitle(String booktitle) {
		for (int i = 0; i < count; i++)
			if (books[i].getBookTitle().equals(booktitle))
				return books[i];
		return null;
	}

	public Book findBookByAuthor(String bookauthor) {
		for (int i = 0; i < count; i++)
			if (books[i].getBookAuthorName().equals(bookauthor))
				return books[i];

		return null;
	}

	public Book findBookByPublisher(String bookpublisher) {
		for (int i = 0; i < count; i++)
			if (books[i].getBookPublisherName().equals(bookpublisher))
				return books[i];
		return null;
	}

	public Book[] getAllBooks() {
		return java.util.Arrays.copyOfRange(books, 0, count);
	}

}
