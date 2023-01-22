package com.greatlearning.lma.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.repository.BookRepository;
import com.greatlearning.lma.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		List<Book> books=bookRepository.findAll();
		return books;
	}

	@Override
	public Book findById(int theId) {
		// TODO Auto-generated method stub
		return bookRepository.findById(theId).get();
	}

	@Override
	public void save(Book theBook) {
		// TODO Auto-generated method stub
		bookRepository.save(theBook);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(theId);
		
	}

	@Override
	public List<Book> searchBy(String bookName, String authorName) {
		
		List<Book> searchResults = 
		bookRepository.findByNameContainsAndAuthorContainsIgnoreCase(
			bookName, authorName);
		
		// TODO Auto-generated method stub
		return searchResults;
	}
}
