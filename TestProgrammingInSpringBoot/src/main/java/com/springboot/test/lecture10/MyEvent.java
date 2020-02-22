package com.springboot.test.lecture10;

import org.springframework.context.ApplicationEvent;

// 4.2 이전
public class MyEvent extends ApplicationEvent {

	private int data;
	
	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public MyEvent(Object source, int data) {
		super(source);
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	
	


}
