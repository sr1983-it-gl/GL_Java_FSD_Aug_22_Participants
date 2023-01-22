package com.greatlearning.lma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greatlearning.lma.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	// Search methods
}
