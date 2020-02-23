### 06. 다양한 연관관계 매핑
* 엔티티의 연관관계를 매핑할 때 고려해야 할 점 : 다중성, 양방향/단방향, 연관관계의 주인

###### 6-1 다대일
~~~
외래키는 항상 다쪽에 있다.

양방향은 외래 키가 있는 쪽이 연관관계의 주인이다.
양방향 연관관계는 항상 서로를 참조해야 한다.
~~~

###### 6-2 일대다
~~~
일대다 관계는 다대일 관계의 반대 방향이다. 엔티티를 하나 이상 참조할 수 있으므로
자바 컬렉션인 Collection, List, Set, Map 중에 하나를 사용해야 한다.
~~~

###### 6-3 일대일
~~~
양쪽이 서로 하나의 관계만 가진다.

반대도 일대일 관계이다.
테이블 관계에서 일대다, 다대일은 항상 다쪽이 외래 키를 가진다.
반면에 일대일 관계에는 주 테이블이나 대상 테이블 둘 중 어느 곳이나 외래 키를 가질 수 있다.

~~~

###### 6-4 다대다
~~~
관계형 데이터베이스는 정규화된 테이블 2개로 다대다 관계를 표현할 수 없다.
그래서 보통 다대다 관계를 일대다, 다대일 관계로 풀어내는 연결 테이블을 사용한다.
~~~

