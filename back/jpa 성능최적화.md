### 성능최적화

~~~
<<엔티티 조회>>
1. 엔티티를 조회해서 그대로 반환
2. 엔티티 조회 후 DTO로 변환
3. fetch 조인으로 쿼리 수 최적화
3. 컬렉션 페이징
  - 컬렉션 fetch 조인시 페이징 불가능
  - ToOne 관계는 fetch 조인으로 쿼리 수 최적화
  - 컬렉션은 fetch 조인 대신에 지연 로딩을 유지하고, hibernate.default_batch_fetch_size,
    @BatchSize 로 최적화

<<DTO 직접 조회>>
1. JPA에서 DTO를 직접 조회
2. 컬렉션 조회 최적화 . 일대다 관계인 컬렉션은 IN 절을 활용해 메모리에서 미리 조회해서 최적화
3. 플랫 데이터 최적화 . JOIN 결과를 그대로 조회 후 원하는 모양으로 직접 변환


권장 순서
1. fetch 조인으로 쿼리 수 최적화
2. 컬렉션 최적화 : hibernate.default_batch_fetch_size, @BatchSize 로 최적화
3. DTO 조회 방식으로 해결이 안되면 NativeSQL or 스프링 JdbcTemplate

~~~
