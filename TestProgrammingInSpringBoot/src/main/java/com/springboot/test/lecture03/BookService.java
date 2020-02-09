package com.springboot.test.lecture03;

import org.springframework.stereotype.Service;

//@Service
public class BookService {
	
	BookRepository bookRepository;

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
}
