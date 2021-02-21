## 아파치 워커

### window 에서 apache + tomcat 연동

* tomcat connector(mod_jk) 사용
  * worker.properties 설정 (Apache 루트 > conf > workers.properties 파일 생성)
  ```
  work.list="example, ...."

  worker."example"server.port=
  worker."example"server.host=
  worker."example"server.type=ajp13
  
  .....
  ```
  * httpd-vhosts.conf 및 httpd.conf 설정
  * Tomcat 설치 서버의 server.xml의 내용을 확인
  ```
  <Connector port="8009" protocol="AJP/1.3" redirectPort="8443" />
  Apache와 Tomcat 서버는 AJP protocol을 이용해 통신 >> AJP/1.3 프로토콜의 connector port를 확인
  ```


---
* 참고 사이트
  * https://goddaehee.tistory.com/77 
  * https://www.lesstif.com/linux-infra-book/%EC%95%84%ED%8C%8C%EC%B9%98-%EC%9B%B9-%EC%84%9C%EB%B2%84%EC%99%80-%EC%97%B0%EB%8F%99%ED%95%98%EA%B8%B0-20776817.html
