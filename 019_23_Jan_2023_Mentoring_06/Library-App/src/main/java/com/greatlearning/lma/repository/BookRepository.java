package com.greatlearning.lma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.lma.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	/*
	
	List<Book> findByName(String name);

	List<Book> findByNameOrderByNameAsc(String name);

	List<Book> findByNameOrderByNameDesc(String name);

	 * Book
	 *  name
	 * 	noOfPages
	
	
	//select * from b where name like 'name%'
	List<Book> findByNameStartingWith(String name);

	//select * from b where name like '%A'
	List<Book> findByNameEndingWith(String name);

	//select * from b where noofpages = '500'
	List<Book> findByNoOfPages(int noofPages);

	//select * from b where noofpages > '500'
	List<Book> findByNoOfPagesGreaterThan(int noofPages);

	//select * from b where noofpages >= '500'
	List<Book> findByNoOfPagesGreaterThanOrEqual(int noofPages);

	//select * from b where noofpages between '500' and '700'
	List<Book> findByNoOfPagesBetween(int begin, int end);
	
	// Search methods
	
	// Name -> 
	List<Book> findByNameContains(String bookName);

	// Author Name -> 
	List<Book> findByAuthorContains(String authorName);

	*/
	
	
	List<Book> findByNameContainsAndAuthorContainsIgnoreCase(
		String bookName, String authorName);

	
	
}
