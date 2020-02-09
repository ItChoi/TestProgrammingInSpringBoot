package com.springboot.test.lecture03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApplicationConfig {
	
	//@Bean
	public BookService bookService() {
		BookService bookService = new BookService();
		bookService.setBookRepository(bookRepository());
		return bookService;
	}

	//@Bean
	public BookRepository bookRepository() {
		return new BookRepository();
	}

	
}
