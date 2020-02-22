### JPA 애플리케이션 개발
- JPA 구동 방식 
    1. Persistence -> META-INF/persistence.xml 설정 정보 조회
    2. Persistence -> EntityManagerFactory 생성
    3. EntityManagerFactory -> EntityManager 생성
    4. 설명: JPA는 Persistence라는 클래스가 있는데, 설정 정보를 읽어서 엔티티매니저팩토리 클래스를 생성하고, 필요 시 EntityManager를 생성
    5. JPA 트랜잭션 단위로 실행되어야 해서 tx가 필요하다.
- 실습 - JPA 동작 확인
    - JpaMain 클래스 생성
    - JPA 동작 확인
- @Entity
    - 로딩 시 JPA 관리를 위한...   
- JPA를 통해 Entity를 가져오면, JPA가 관리한다. 변경 여부를 트랜잭션 커밋하는 시점에 체크를 하고, 변경이 있을 시 update query를 날리고 커밋이 된다. 따라서 setName만 하면 되고 setName된 Entity를 개발자가 update 시켜줄 필요가 없다. 자바컬렉션과 같이 설계되어 있다.

- 주의
    - 엔티티 매니저 팩토리는 하나만 생성해서 애플리케이션 전체에서 공유
      - 웹 서버 올라가는 시점에 DB당 하나만 생성
    - 엔티티 매니저는 쓰레드간에 공유 X (사용 후 버려야 한다)
      - 고객 요청 시 사용 후 버림을 반복
      - 쓰레드간 공유를 절대 하면 안된다!!
    - JPA의 모든 데이터 변경은 트랜잭션 안에서 실행
      - 중요~~!
- RDB는 데이터 변경 자체를 트랜잭션 안에서 하도록 설계가 되어 있다!      
- JPQL 소개
    - 가장 단순한 조회 방법
      - EntityManager.find()
      - 객체 그래프 탐색 (a.getB().getC())
    - 나이가 18살 이상인 회원 모두 검색하고 싶다면?
    - JPA는 엔티티 객체를 중심으로 개발, 조회 시에도 테이블이 아닌 객체를 대상으로 검색
    