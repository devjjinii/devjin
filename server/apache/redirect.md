## http > https 로 redirect 하기

* httpd.conf 파일 수정
  ```
    <VirtualHost *:80>
    ......

        RewriteEngine on
        RewriteCondition %{HTTPS} !=on
        RewriteRule ^/(.*) https://%{SERVER_NAME}/$1 [R,L]  // {SERVER_NAME} 부분에 서버 주소 입력 수행


    </VirtualHost>
  ```
