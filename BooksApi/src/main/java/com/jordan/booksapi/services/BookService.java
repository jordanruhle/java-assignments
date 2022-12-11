package com.jordan.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jordan.booksapi.models.Book;
import com.jordan.booksapi.repositories.BookRepository;
@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		// TODO Auto-generated method stub
		bookRepository.save(title, desc, lang, numOfPages);
		return null;
	}
	
	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
		
	}
}