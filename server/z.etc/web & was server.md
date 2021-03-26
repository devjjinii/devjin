## WEB & WAS

* `Client ---> Web Server ---> WAS ---> DB`

* WEB SERVER --> NGINX, APACHE...
  * 정적인 리소스
* WAS SERVER --> TOMCAT, JETTY, UNDERTOW...
  * 정적인 리소스 + `애플리케이션 로직` 수행
* `JAVA` --> 서블릿 컨테이너 기능을 제공하면 WAS
