## gradle upgrade

~~~
미루고 미룬끝에 개인노트북의 자바버전을, 
(새 노트북을 들이기전에...) 
8에서 11로 바꿨다.

gradle build 하니, 오류가 났다.

* What went wrong:
An exception occurred applying plugin request [id: 'org.springframework.boot', version: '2.3.3.RELEASE']
> Failed to apply plugin [id 'org.springframework.boot']
   > Spring Boot plugin requires Gradle 5 (5.6.x only) or Gradle 6 (6.3 or later). The current version is Gradle 4.10.1

스프링부트랑 버전이 안맞아서 그런것 같다.

gradle 6버전을 설치해준다.

참고 : https://docs.gradle.org/current/userguide/userguide.html
~~~
