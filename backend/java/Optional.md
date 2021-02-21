## Optional 클래스

* NPE 방지 > NullPointerException
* 'T'타입의 객체를 포장해주는 Wrapper class

* java.util.Optional<T>
   ```java
   Optional<User> optUser; 
   ```
* Optional.empty()
  * 비어있는 Optional 객체를 생성.
  * 반환할 값이 없는 경우에 사용.
  
* Optional.ofNullable(value) 
  * value가 null인지 아닌지 확신할 수 없는 객체를 담고 있는 Optional 객체를 생성.
  * null 인 경우 비어있는 Optional 을 반환.
