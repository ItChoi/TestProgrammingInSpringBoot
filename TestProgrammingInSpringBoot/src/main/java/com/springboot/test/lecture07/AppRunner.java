package com.springboot.test.lecture07;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Environment env = ctx.getEnvironment();
		 System.out.println(Arrays.toString(env.getActiveProfiles()));
		 System.out.println(Arrays.toString(env.getDefaultProfiles()));
	}
	
	

}
