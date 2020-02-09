package com.springboot.test.lecture04;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
// public class BookService {
public class BookService implements InitializingBean {
	
	/*
	 * @Autowired
	 * 
	 * @Qualifier("keesunBookRepository") BookRepository bookRepository;
	 */
	
	@Autowired
	List<BookRepository> bookRepositories;
	
	
	public void printBookRepository() {
		// System.out.println(bookRepository.getClass());
		
		this.bookRepositories.forEach(System.out::println);
		
	}


	// 빈 인스턴스가 만들어진 후 부가적인 작업이 필요할 때
	@Override
	public void afterPropertiesSet() throws Exception {
		this.bookRepositories.forEach(System.out::println);
	}
	
	/*
	 * @Autowired BookRepository bookRepository;
	 */

	/*
	 * @Autowired public BookService(BookRepository bookRepository) {
	 * this.bookRepository = bookRepository; }
	 */
	
	/*
	 * @Autowired public void setBookRepository(BookRepository bookRepository) {
	 * this.bookRepository = bookRepository; }
	 */
	
	// 빈이 만들어지고 나서 돌 로직
	// @PostConstruct
	
}
