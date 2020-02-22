package com.springboot.test.lecture09;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Apprunner implements ApplicationRunner {

	@Autowired
	ApplicationContext appCtx;
	
	@Autowired
	MessageSource messageSource;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// 리소스번들메시지소스가 스부를 쓰면 빈으로 자동으로 등록된다. 따라서 자동으로 두 개의 프로퍼티를 읽어들인다.
		System.out.println(messageSource.getClass());
		
		System.out.println(messageSource.getMessage("greeting", new String[] {"keesun"}, Locale.KOREA));
		System.out.println(messageSource.getMessage("greeting", new String[] {"keesun"}, Locale.getDefault()));
	}
	

}
