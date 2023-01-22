package com.greatlearning.lma.service;

import java.util.List;

import com.greatlearning.lma.entity.Book;

public interface BookService {

	public List<Book> findAll();

	public Book findById(int theId);

	public void save(Book theBook);

	public void deleteById(int theId);

	public List<Book> searchBy(String bookName, String authorName);
}
