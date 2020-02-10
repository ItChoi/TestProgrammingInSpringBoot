### IoC 컨테이너 6 - Environment 1 - 프로파일
- 프로파일과 프로퍼티를 다루는 인터페이스.
- ApplicationContext extends EnvironmentCapable
    - getEnvironment()
- 프로파일
    - 빈들의 그룹
    - Environment의 역할은 활성화할 프로파일 확인 및 설정
- 프로파일 유즈케이스
    - 테스트 환경에서는 A라는 빈을 사용하고, 배포 환경에서는 B라는 빈을 쓰고 싶다.
    - 이 빈은 모니터링 용도니까 테스트할 때는 필요가 없고 배포 시 등록되면 좋다.
- 프로파일 정의하기
    - 클래스에 정의
      - @Configuration @Profile("test")
      - @Component @Profile("test")
    - 메소드에 정의
      - @Bean @Profile("test")
- 프로파일 설정하기
    - -Dspring.profiles.active="test.A.B..." // 인텔리제이에서는 Configuration active profiles에서 설정
    - @ActiveProfiles(테스트용)
- 프로파일 표현식
    - ! (not)
    - & (and)
    - | (or)    
    
    
#### 강의
- profile
    - 빈들의 묶음.
    - Maven에도 개념이 있다.
    - 스프링 프로파일도 환경이다. 이런 이런 빈들을 쓰겠다. 알파.. 베타.. 스테이징 (개발, 프로덕션 서버 등..)
    - 각 환경마다 빈을 다르게 쓰는 경우
    - 특정 환경에만 어떤 빈을 등록해야 하는 경우
    
    