### IoC 컨테이너 9 - ApplicationEventPublisher
- 이벤트 프로그래밍에 필요한 인터페이스 제공, 옵저버 패턴 구현체
- ApplicationContext extends ApplicationEventPublisher
    - publishEvent(ApplicationEvent event)
- 이벤트 만들기
    - ApplicationEvent 상속
    - 스프링 4.2 부터는 이 클래스를 상속받지 않아도 이벤트로 사용 가능
- 이벤트 발생시키는 방법
    - ApplicationListener<이벤트> 구현한 클래스 만들어서 빈으로 등록
    - 스프링 4.2부터는 @EventListener를 사용하여 빈 메소드 사용 가능
    - 기본적으로 synchronized
    - 순서 정하고 싶을 시 @Order 사용
    - 비동기적으로 실행하고 싶다면 @Async 사용
- 스프링이 제공하는 기본 이벤트
    - ContextRefreshedEvent: ApplicationContext를 초기화 했거나 리프래시 했을 때 발생
    - ContextStartedEvent: ApplicationContext를 start()하여 라이프사이클 빈들이 시작 신호를 받은 시점에 발생
    - ContextStoppedEvent: ApplicationContext를 stop()하여 라이프 사이클 빈들이 정지 신호를 받은 시점에 발생
    - ContextClosedEvent: ApplicationContext를 close()하여 싱글톤 빈 소멸되는 시점에 발생
    - RequestHandlerEvent: HTTP 요청을 처리했을 때 발생
    
#### 인강