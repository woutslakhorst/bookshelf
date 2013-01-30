package com.nedap.healthcare.bean;

import java.util.List;

import javax.ejb.Local;

import com.nedap.healthcare.domain.Book;

@Local
public interface BookService {
	public List<Book> list();
	public Book createOrUpdate(Book book);
	public void remove(Book book);
	public Book find(Long id);
}
