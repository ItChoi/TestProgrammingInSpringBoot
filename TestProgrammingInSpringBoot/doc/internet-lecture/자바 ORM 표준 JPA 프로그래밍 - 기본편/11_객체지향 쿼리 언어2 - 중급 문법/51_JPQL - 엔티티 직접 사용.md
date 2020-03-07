### JPQL - 엔티티 직접 사용

#### 엔티티 직접 사용 - 기본 키 값
- JPQL에서 엔티티를 직접 사용하면 SQL에서 해당 엔티티의 기본 키 값을 사용
- JPQL
    - select count(m.id) from Member m // 엔티티의 아이디를 사용
    - select count(m) from Member m // 엔티티를 직접 사용
- SQL (JPQL 둘 다 같은 SQL 실행)
    - select count(m.id) as cnt from Member m
- 엔티티를 넘기는 거 자체가 엔티티의 DB에 넘어가면 pk값이기 때문에, 엔티티를 파라미터로 넘길 수 있다. (PK를 꺼내서 사용)

#### 엔티티 직접 사용 - 외래 키 값
- m.team = :team -> team_id를 가르킨다.
- m.team.id = :team.id 