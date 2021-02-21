## @Bean, @Configuartion, @Component

* `@Bean` : 개발자가 직접 제어가 불가능한 외부 라이브러리 또는 설정을 위한 클래스를 Bean으로 등록
  * 1개 이상의 @Bean을 제공하는 클래스는 `@Configuration` 을 명시
* `@Component` : 개발자가 직접 설정한 클래스를 Bean으로 등록시 활용
