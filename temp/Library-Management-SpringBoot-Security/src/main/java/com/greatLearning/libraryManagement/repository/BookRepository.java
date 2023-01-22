package com.greatLearning.libraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.libraryManagement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByNameContainsAndAuthorContainsAllIgnoreCase(String name,String author);
	
}
