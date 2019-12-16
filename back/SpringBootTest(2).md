## SpringBootTest

* Gradle + springBoot + JPA  ..//(h2)

~~~
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


junit4 테스트를 하는데 계속 아래와 같은 오류가 났다.

->  java.lang.IllegalStateException: Failed to load ApplicationContext 

처음에는 yml 파일에 오타, 잘못된 부분을 찾아봤지만 yml파일에는 문제 없었다.
spring:
  datasource:
    url: 
    username: 
    password:
    driver-class-name: org.h2.Driver

  jpa:
    hibernate:
      ddl-auto: create
    properties:
      hibernate:
        format_sql: true

logging.level:
   org.hibernate.SQL: debug


버전의 문제도 있었지만 , build.gradle 을 수정했다.
---------------------------------------------------------------------------
testImplementation('org.springframework.boot:spring-boot-starter-test') {
		exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
	}
test {
	useJUnitPlatform()
}
---------------------------------------------------------------------------
를

---------------------------------------------------------------------------
testImplementation('org.springframework.boot:spring-boot-starter-test') 
---------------------------------------------------------------------------

한줄로.

정상적으로 테스트 할 수 있었다.
~~~
