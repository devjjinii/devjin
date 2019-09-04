####  ZUUL PROXY (Spring Boot)<br>
##### zuul : 모든 마이크로서비스에 대한 요청을 먼저 받아들이고 라우팅하는 프록시 API Gateway 기능을 수행 <br>
zuul.routes.api.path = /abcd/** <br>
zuul.routes.api.url = http://localhost:port <br>
-> "/abcd" 경로로 유입되는 것은 http://localhost:port 로 연결한다. (url 패턴에 따라 자동으로 API server로 전달)
