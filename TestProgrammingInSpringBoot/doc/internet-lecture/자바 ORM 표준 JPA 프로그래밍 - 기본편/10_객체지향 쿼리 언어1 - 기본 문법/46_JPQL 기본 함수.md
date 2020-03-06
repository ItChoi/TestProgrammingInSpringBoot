### JPQL 기본 함수
- CONCAT
- SUBSTRING
- TRIM
- LOWER, UPPER
- LENGTH
- LOCATE
- ABS, SQRT, MOD
- SIZE, INDEX(JPA 용도)

#### 사용자 정의 함수 호출
- 하이버네이트는 사용전 방언에 추가해야한다.
    - 사용하는 db 방언을 상속받고, 사용자 정의 함수를 등록한다.
    - ex) select function('group_concat', i.name) from Item i
- DB 종속적인 방언에 대한 함수가 만들어져있긴 하다.