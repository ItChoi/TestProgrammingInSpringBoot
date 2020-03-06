### 프로젝션(SELECT)
- select 절에 조회할 대상을 지정하는 것
- 프로젝션 대상: 엔티티, 임베디드 타입, 스칼라 타입(숫자, 문자등 기본 데이터 타입)
- select m from Member m -> 엔티티 프로젝션
- select m.team from Member m -> 엔티티 프로젝션
- select m.address from Member m -> 임베디드 타입 프로젝션
- select m.username, m.age from Member m -> 스칼라 타입 프로젝션
- DISTINCT로 중복 제거

#### 프로젝션 - 여러 값 조회
- 프로젝션은 영속성 컨텍스트에서 다 관리된다.
- select m.username, m.age from Member m
- 1. Query 타입으로 조회
    - Object -> Object[] 타입 캐스팅 후 포이치로 값 뽑아~
- 2. Object[] 타입으로 조회
    - 제네릭에 Object[]로 선언! -> 이거도 썩 마음에 들진 않는다.
- 3. new 명령어로 조회ㅈ
    - 제일 깔끔!
    - 단순 값을 DTO로 바로 조회: select new jpabook.jpql.UserDto(m.username, m.age) from Member m
    - 패키지명을 포함한 전체 클래스명 입력
    - 순서와 타입이 일치하는 생성자 필요
    