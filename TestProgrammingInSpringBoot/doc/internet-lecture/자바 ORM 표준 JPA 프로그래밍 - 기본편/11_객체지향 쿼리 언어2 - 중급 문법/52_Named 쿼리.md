### JPQL - Named 쿼리
- 미리 정의해서 이름을 부여해두고 사용하는 JPQL
- 정적 쿼리
- 어노테이션, XML에 정의
- 애플리케이션 로딩 시점에 초기화 후 재사용
    - 정적 쿼리기 때문에, JPA나 hibernate가 sql로 파싱하여 **캐싱**하여 사용한다
- **애플리케이션 로딩 시점에 쿼리를 검증**
    - 문자라서 실행은 되나, 로딩 시점에 에러가 난다.
- ex) @Entity @NamedQuery(name = "Member.findByUsername", query = "select m from Member m where m.username = :username") public class Entity { }
    - 쿼리명은 아무렇게나 해도 된다. 관례는 엔티티.메소드명

#### Named 쿼리 -XML 정의

#### Named 쿼리 환경에 따른 설정
- XML이 항상 우선권을 가진다.
- 애플리케이션 운영 환경에 따라 다른 XML을 배포할 수 있다.