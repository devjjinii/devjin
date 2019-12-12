## client IP 를 얻기 위한 header

~~~
* HTTP Header 중 하나로 HTTP Server 에 요청한 clinet 의 IP 를 식별하기 위한 사실상의 표준이다.

* X-Forwarded-For: <client>, <proxy1>, <proxy2>
<client> : 클라이언트 IP주소   
<proxy1> , <proxy2> : 하나의 요청이 여러 프록시들을 거치면, 각 프록시의 IP 주소들이 차례로 열거된다. 
즉, 가장 오른쪽 IP 주소는 가장 마지막에 거친 프록시의 IP 주소이고, 가장 왼쪽의 IP 주소는 최초 클라이언트의 IP 주소다.              


// ! 사용 할 때, XFF는 완전한 표준은 아니므로 사용에 주의해야 한다.
 String ip = request.getHeader("X-FORWARDED-FOR");
      if (ip == null) {
          ip = request.getRemoteAddr();
      }
~~~
