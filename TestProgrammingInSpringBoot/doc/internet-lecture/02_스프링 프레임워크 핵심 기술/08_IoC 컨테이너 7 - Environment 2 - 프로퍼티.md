### IoC 컨테이너 7 - Environment 2 - 프로퍼티
- 프로퍼티
    - 다양한 방법으로 정의할 수 있는 설정값
    - Environment의 역할은 프로퍼티 소스 설정 및 프토퍼티 값 가져오기
- 프로퍼티 우선 순위!
    - StandardServletEnvironment 우선 순위
        - ServletConfig 변수
        - ServletContext 매개 변수
        - JNDI (java:comp/env/)
        - JVM 시스템 프로퍼티 (-DKey="value")
        - JVM 시스템 환경 변수 (운영 체제 환경 변수)
- @PropertySource
    - Environment를 통해 프로퍼티 추가 방법
- 스프링 부트의 외부 설정 참고
    - 기본 프로퍼티 소스 지원 (applicat ion.properties)
    - 프로파일까지 고려한 계층형 프로퍼티 우선 순위 제공

#### 인강
- VM 옵션에 설정한 것을 Environtment 프로퍼티로 가져올 수 있다.
- @PropertySource를 통해 .properties에 설정한 값을 가져올 수 있다.
- @Value를 통해 ${aa.aa} 설정하여 값을 가져올 수 있다.
    