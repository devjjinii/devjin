 ## web.xml

* welcome-file
  * 루트경로로 접근시 첫번째 `<welcome-file>` 을 읽고 해당파일이 존재하면 해당페이지로 이동.
    * 존재하지 않을 경우 다음 순서의 `<welcome-file>` 페이지로 이동.
```xml
 <welcome-file-list>
    <welcome-file>'해당파일의 경로'</welcome-file>
    <welcome-file>'해당파일의 경로2'</welcome-file>
 </welcome-file-list>
```
* welcome-file 을 사용하는 이유
  * `localhost:8080/main` 와 같은 url 로 접근하기 보다는 `localhost:8080` 형태로 들어오는 경우가 대부부인데
  페이지가 없기 때문에 404 에러가 발생함. --> welcome-file 을 설정하면 해당페이지로 리다이렉트 시켜줌.

* 세션 타임아웃
 * 디폴트 : 30분 (단위, minute) 
```xml
<session-config>
  <session-timeout>분</session-timeout>
</session-config>
```
