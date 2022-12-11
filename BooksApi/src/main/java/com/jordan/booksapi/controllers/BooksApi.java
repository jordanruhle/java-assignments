package com.jordan.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jordan.booksapi.models.Book;
import com.jordan.booksapi.services.BookService;

@RestController
public class BooksApi {
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    //Get All
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.allBooks();
    }
    
    //Update
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id") Long id, 
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang,
    		@RequestParam(value="pages") Integer numOfPages){
        Book book = bookService.updateBook(id, title, desc, lang, numOfPages);
        return book;
    }
    
    //Delete
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        bookService.deleteBook(id);
    }
    
    //Create One
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang, 
    		@RequestParam(value="pages") Integer numOfPages
    		) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    // Get book by Id
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
}