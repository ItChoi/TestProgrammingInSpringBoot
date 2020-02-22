### IoC 컨테이너 8 - MessageSource
- 국제화 (i18n) 기능을 제공하는 인터페이스
- ApplicationContext extends MessageSource
    - getMessage(String code, Object[] args, String default, Locale loc)
    -
- 스프링 부트를 사용한다면 별다른 설정 없이 messages.properties 사용 가능
    - messages.properties
    - messages_ko_kr.properties
- 릴로딩 기능이 있는 메시지 소스 사용
        
#### 인강
- ApplicationContext에 MessageResource를 사용할 수 있다.
- 스프링부트에서는 리소스번들메시지소스가 빈으로 자동으로 등록된다. 따라서 자동으로 두 개의 프로퍼티를 읽어들인다. (messages.properteis, messages_ko_kr.properties)
- MessageSource 오버라이드 가능
- 빌드된 디렉토리에 있는 클래스 패스에 있는 파일을 읽어드려 쓰기에, 수정 시 빌드가 되어야 한다. 