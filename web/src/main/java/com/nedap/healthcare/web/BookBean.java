package com.nedap.healthcare.web;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.nedap.healthcare.bean.BookService;
import com.nedap.healthcare.domain.Book;

public class BookBean {

	// @EJB //unsupported in jboss 4
	BookService service;

	private String title;
	private String author;
	private String isbn;

	public BookBean() {
		try {
			Context ctx = new InitialContext();
			service = (BookService) ctx.lookup("ear-1.0/BookServiceBean/local");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public List<Book> getList() {
		return service.list();
	}

	public String newBook() {
		title = "";
		author = "";
		isbn = "";
		return "new";
	}

	public String save() {
		Book b = new Book(title);
		b.setAuthor(author);
		b.setIsbn(isbn);
		service.createOrUpdate(b);
		return "success";
	}

	public String editBook(Book b) {
		title = b.getTitle();
		author = b.getAuthor();
		isbn = b.getIsbn();
		return "new";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
