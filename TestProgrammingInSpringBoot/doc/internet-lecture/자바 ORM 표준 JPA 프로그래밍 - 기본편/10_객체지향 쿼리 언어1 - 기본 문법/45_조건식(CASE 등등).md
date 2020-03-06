### 조건식 (CASE 등등)
- 기본 CASE 식
    - select case when m.age < 10 then '학생요금' else '일반 요금' end from Member m
- 단순 CASE 식
    - select case t.name = when '팀A' then '인센티브 110%' else '인센티브 105%' end from Team t
- COALESCE: 하나씩 조회해서 null이 아니면 반환
    - ex) select coalesce(m.username, '이름없는회원') from Member m 
- NULLIF: 두 값이 같으면 null 반환, 다르면 첫 번째 값 반환
    - ex) select NULLIF(m.username, '관리자') from Member m