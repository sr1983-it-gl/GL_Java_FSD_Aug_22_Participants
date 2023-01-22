package com.greatlearning.lma.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.greatlearning.lma.entity.Book;
import com.greatlearning.lma.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/list")
	public String listBooks(Model theModel) {
		

		// get Books from db
		List<Book> theBooks = bookService.findAll();

		// add to the spring model
		theModel.addAttribute("Books", theBooks);
		

		return "list-Books";
	}

	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Book theBook = new Book();

		theModel.addAttribute("Book", theBook);

		return "Book-form";
	}

	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int theId,
			Model theModel) {

		// get the Book from the service
		Book theBook = bookService.findById(theId);


		// set Book as a model attribute to pre-populate the form
		theModel.addAttribute("Book", theBook);

		// send over to our form
		return "Book-form";			
	}


	@PostMapping("/save")
	public String saveBook(@RequestParam("id") int id,
			@RequestParam("name") String name,@RequestParam("category") String category,@RequestParam("author") String author) {

		System.out.println(id);
		Book theBook;
		if(id!=0)
		{
			theBook=bookService.findById(id);
			theBook.setName(name);
			theBook.setCategory(category);
			theBook.setAuthor(author);
		}
		else
			theBook=new Book(name, category, author);
		// save the Book
		bookService.save(theBook);


		// use a redirect to prevent duplicate submissions
		return "redirect:/books/list";

	}

	

	@RequestMapping("/delete")
	public String delete(@RequestParam("bookId") int theId) {

		// delete the Book
		bookService.deleteById(theId);

		// redirect to /Books/list
		return "redirect:/books/list";

	}

	@RequestMapping("/search")
	public String search(
		@RequestParam("name") String bookName,
		@RequestParam("author") String authorName,
		Model theModel) {
		
		if (bookName.trim().isEmpty() && authorName.trim().isEmpty()) {
			return "redirect:/books/list";
		}else {
		
			List<Book> books = bookService.searchBy(bookName, authorName);
		
			// add to the spring model
			theModel.addAttribute("Books", books);
			

			return "list-Books";
			
		}
	}

	@RequestMapping(value = "/403")
	public ModelAndView handleForbiddenError(Principal user) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("403");
		
		String message = "";
		if (user != null) {
			
			message = "Hello " + user.getName() + ", "
				+ " You dont have permission to access the page / perform the operation";						
		}else {

			message = "Hello " + ", "
					+ " You dont have permission to access the page / perform the operation";									
		}
		
		mv.addObject("msg", message);
		
		return mv;		
	}

}
