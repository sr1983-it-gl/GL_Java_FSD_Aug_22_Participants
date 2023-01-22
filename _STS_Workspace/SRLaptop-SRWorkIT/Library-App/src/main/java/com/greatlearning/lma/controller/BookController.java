package com.greatlearning.lma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
//	@RequestMapping("/books/list")
	@RequestMapping("/list")
	public String listBooks(Model model) {
		
		List<Book> books = bookService.listAll();
		
		model.addAttribute("books", books);
		
		System.out.println(books);
		
		
		return "list-books";
	}
}
