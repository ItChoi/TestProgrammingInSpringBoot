### IoC 컨테이너 10 - ResourceLoader
- 리소스를 읽어오는 기능을 제공하는 인터페이스
- ApplicationContext extends ResourceLoader
- 리소스 읽어오기
    - 파일 시스템에서 읽어오기
    - 클래스패스에서 읽어오기
    - URL로 읽어오기
    - 상대 / 절대 경로로 읽어오기
- Resource getResource(java.lang.String location)

#### 인강
