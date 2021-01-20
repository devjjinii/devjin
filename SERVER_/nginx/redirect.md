## http > https 로 redirect 하기

* 80으로 들어오는 요청을 443으로 리다이렉트 해주면 된다.
    1. VirtualHost 별로 아래와 같이 Port 80 에 대한 Server설정과 443에 대한 Server설정을 분리
    2. Port 80 에 대해서는 301 Redirect 설정 
    3. Nignx 재시작

  ```
    server {
           listen         80;
           server_name    example1.com example2.com;
           return         301 https://$host$request_uri;
    }

    server {
           listen         443 ssl;
           server_name    example1.com example2.com;
           ...
    }
  ```

* 참고사이트
  * https://medium.com/@peterkimzz/nginx-http%EB%A5%BC-https%EB%A1%9C-redirect%ED%95%98%EA%B8%B0-983d48722088
