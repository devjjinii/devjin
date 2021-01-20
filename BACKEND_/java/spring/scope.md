## 빈의 스코프

```java
@Component @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

}
```

* class 기반의 proxy를 만들어서 Proto를 감싼다. 
   * proxy를 거쳐서 참조해야한다.

* 인스턴스를 감싸는 프록시 인스턴스가 만들어지고, 프록시 인스턴스가 빈으로 등록이 된다.
   * 프록시빈 "Proto" 가 주입이 된다.
