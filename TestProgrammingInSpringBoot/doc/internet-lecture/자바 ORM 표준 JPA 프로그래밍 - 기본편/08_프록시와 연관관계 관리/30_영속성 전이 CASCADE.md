### 영속성 전이: CASCADE
- 특정 엔티티를 영속 상태로 만들 때 연관된 엔티티도 함께 영속 상태로 만들고 싶을  때
- ex) 부모 저장 시 자식도 함께 저장 // 부모 (1) - (N) 자식
- 연관 관계랑 상관 없다.

#### 영속성 전이: 저장
- @OneToMany(mappedBy="parent", cascade=CascadeType.PERSIST)
    - -> 영속화 -> parent -> 영속성 전이 -> children(child1, child2)

#### 연관 관계 편의 메소드
- 부모 @OneToMany List<Child> childList, 자식 @ManyToOne
- 부모에서 addChild(Child child) { childList.add(child; child.setParent(this); }
    - add 시 이전 꺼 뺴고 등등 복잡한 로직이 더 있어야 한다.
    - new Child(), new Child() -> parent.addChild(child)
      - em.persist(parent) em.persist(child) em.persist(child) // 이렇게 해야 persist가 3개가 된다.
      - parent 중심으로 코드를 작성하고 있는데 너무 귀찮다.
      - 코드 짤 때 parent가 child를 자동으로 persist가 됐으면 할 때, cascade 사용!!
      - 부모에서 cascade = CascadeType.ALL을 주면, parent만 persist해도 child들이 자동으로 persist 된다!!
      
#### 영속성 전이: CASCADE - 주의
- 영속성 전이는 연관 관계를 매핑하는 것과 아무 관련이 없다.
- 엔티티를 영속화할 때 연관된 엔티티도 함께 영속화하는 편리함을 제공할 뿐!

#### CASCADE 종류 - 실무에서 많이 사용한다고 한다!
- **ALL: 모두 허용**
- **PERSIST: 영속** - 저장 시에만 CASCADE 적용
- **REMOVE: 삭제**
- MERGE: 병합
- REFRESH: 리프레시
- DETACH: 분리

#### CASCADE 언제 써야 할까?
- 1:N는 다 걸어야 할까? 아니다. 하나의 부모가 자식들을 관리할 때 의미가 있다.
- 라이프 싸이클이 똑같을 때 (부모, 삭제) - 등록, 삭제가 비슷할 때
- 단일 소유자일 때! 자식이 다른 곳에서도 사용 될 때 곤란해진다.

#### 고아 객체
- 고아 객체 제거: 부모 엔티티와 연관 관계가 끊어진 자식 엔티티를 자동으로 삭제
- orphanRemoval = true
- Parent parent1 = em.find(Parent.class, id); 
- parent1.getChildren().remove(0); // 자식 엔티티를 컬렉션에서 제거
- DELETE FROM CHILD WHERE id = ? // 연관 관계가 끊어지면 delete 쿼리가 나간다.

#### 고아 객체 - 주의
- 참조가 제거된 엔티티는 다른 곳에서 참조하지 않는 고아 객체로 보고 삭제하는 기능
- **참조하는 곳이 하나일 때 사용!!**
- **특정 엔티티가 개인 소유할 때 사용**
- @OneToOne, @OneT oMany만 가능
- 참고: 개념적으로 부모를 제거하면 자식은 고아가 된다. 따라서 고아 객체 제거 기능을 활성화 하면, 부모를 제거할 때 자식도 함께 제거 된다. 이것은 CascadeType.REMOVE 처럼 동작한다.

#### 영속성 전이 + 고아 객체, 생명줒기
- CascadeType.ALL + orphanRemoval = true
- 스스로 생명주기를 관리하는 엔티티는 em.persist()로 영속화, em.remove()로 제거
- 두 옵션을 모두 활성화하면 부모 엔티티를 통해서 자식의 생명 주기를 관리할 수 있음
- DDD의 Aggregate Root 개념을 구현할 때 유용
