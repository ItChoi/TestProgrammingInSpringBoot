### IoC 컨테이너 4 - @Component와 컴포넌트 스캔
- 컴포넌트 스캔 주요 기능
    - 스캔 위치 설정
    - 필터: 어떤 애노테이션을 스캔할지 또는 하지 않을지
- @Component
    - @Repository
    - @Service
    - @Controller
    - @Configuration
- 동작 원리
    - @ComponentScan은 스캔할 패키지와 애노테이션에 대한 정보
    - 실제 스캐닝은 ConfigurationClassPostProcessor라는 BeanFactoryPostProcessor에 의해 처리 된다.
- 펑션을 사용한 빈 등록
```java
public static void main(String[] args) {
	new SpringApplicationBuilder()
		.sources(Application.class)
		.initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
			applicationContext.registerBean(MyBean.class);
		})
		.run(args);
}
```    