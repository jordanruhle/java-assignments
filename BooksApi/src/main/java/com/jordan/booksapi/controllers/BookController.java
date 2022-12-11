package com.jordan.booksapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jordan.booksapi.models.Book;
import com.jordan.booksapi.services.BookService;

@Controller
public class BookController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	BookService bookService;
	
    @GetMapping("/")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }

    // READ ONE BOOK
 	@GetMapping("/books/{id}")
 	public String showOne(
 		@PathVariable("id") Long id,
 		Model model
 	) {
 		// RETRIEVE ONE BOOK FROM DB
 		Book oneBook = bookService.findBook(id);
 		
 		// PASS THE INFORMATION TO THE JSP
 		model.addAttribute("book", oneBook);
 	
 		return "show.jsp";
 	}
}
