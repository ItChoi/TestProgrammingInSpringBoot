package com.springboot.test.lecture07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

	@Bean
	public BookRepository bookRepository() {
		return new TestBookRepository();
	}
}
