package com.springboot.test.lecture06;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;

// @Component
public class Single {

	// 싱글톤 객체는 하나의 객체를 가져오는데, 프로토타입 객체인데, 싱글톤 객체를 참조하고 있따면 프로토타입도 싱글톤 방식의 객체를 가져온다.
	// 해결방법이 있다. 프록시 모드를 설정!
	/*
	 * @Autowired Proto proto;
	 */
	
	// 위에 애노테이션 사용 하는 방식 외에 대체 방법 - 백선장님은 호감하지 않는 방법. - 코드 자체에 스프링 코드가 들어가기 때문..
	//@Autowired
	//private ObjectProvider<Proto> proto;
	
	/*
	 * @Autowired private ApplicationContext ctx;
	 */

	/*
	 * public Proto getProto() { // return proto; return proto.getIfAvailable(); }
	 */
	
	
}
