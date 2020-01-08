## tomcat(1)

~~~
No Spring WebApplicationInitializers types detected on classpath
Starting ~~~`

//local에서 개발할때 server-start를 하면, 가끔 로그도 안올라오고 페이지 404 오류를 낼때가 있다.

* Spring WebApplicationInitializers detected on classpath 까지 올라와야 하는데, 못올라오는 경우.
그럴때 마다 clean 또는 clean tomcat directory 해주고 재시작하면 되는데, (또는 그냥 재시작)
느낌상 해석해보면 경로문제인 것 같다. classpath를 못찾아서 ..(?) 

https://tomcat.apache.org/tomcat-8.0-doc/class-loader-howto.html
~~~
