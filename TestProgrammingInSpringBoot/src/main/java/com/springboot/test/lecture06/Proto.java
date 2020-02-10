package com.springboot.test.lecture06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component
// 클래시 기반의 프록시로 감싸라 이 빈을!
// 스코프 타입 빈을 직접 참조가 아니라, 프록시를 거쳐 써야 한다.
// 직접 쓰면 프로토타입을 매번 새로운 빈으로 바꿔야 하는데, cg 라이브러리를 통해 클래스도 프록시로 만들 수 있게 해준다.
// 자바 기반 프록시는 인터페이스 프록시밖에 못 만든다.
//@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
// @Scope("prototype")
public class Proto {
	
	// 매번 같은 객체이기 떄문에 의도한 인스턴스를 가져와 싱글톤 객체를 가져왔을 땐 문제가 없다.
	@Autowired
	Single single;

}
