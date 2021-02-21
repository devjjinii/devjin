## cookie

* https://plugins.jquery.com/cookie/

* `<script type="text/javascript" src="......./////jquery.cookie.js"></script>`

* 쿠키 생성
```javascript
// 세션 쿠키 생성 - 브라우저를 닫으면 없으집니다. 
$.cookie('name', 'value'); 
// 7일 뒤에 만료되는 쿠키 생성 
$.cookie('name', 'value', { expires: 7 }); 
// 전체 사이트에 대해 7일 뒤에 만료되는 쿠키 생성 
$.cookie('name', 'value', { expires: 7, path: '/' });
```

* 쿠키 읽기
```javascript
// 키로 사용한 이름으로 값을 읽습니다. 
// 키로 저장된 값이 없으면 undefined 가 반환됩니다.
$.cookie('name'); 

// 모든 쿠키 읽기 
// 모든 쿠키를 { "name": "value" } 형태의 객체로 반환합니다. 
$.cookie();
```

* 쿠키 삭제
```javascript
// 성공적으로 삭제되면 true 를 반환하고, 삭제 못했을때는 false를 반환합니다. 
$.removeCookie('name'); 

// 쿠키 삭제시 생성할때 와 같은 path와 domain 을 사용해야 합니다. 
// 아래와 같이 생성했다면, 
$.cookie('name', 'value', { path: '/' }); 
// 이렇게 삭제할 수 없습니다.
$.removeCookie('name'); // => false 
// 이렇게 삭제해야 합니다. 
$.removeCookie('name', { path: '/' }); // => true
```