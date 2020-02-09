package com.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

import com.springboot.test.lecture05.MyService;

@SpringBootApplication
public class Application {
	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		// (1) SpringApplication.run(Application.class, args);
		SpringApplication app = new SpringApplication(Application.class);
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> {
			ctx.registerBean(MyService.class);
		});
		
		app.run(args);

		// ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// XML 설정 가져오는 것
		// ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		/*
		 * String[] beanDefinitionNames = context.getBeanDefinitionNames();
		 * System.out.println(Arrays.toString(beanDefinitionNames));
		 * 
		 * BookService bookService = (BookService) context.getBean("bookService");
		 * System.out.println(bookService.bookRepository != null);
		 */
		
		
	}

}
