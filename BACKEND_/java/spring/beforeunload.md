## beforeunload

* 크롬 > 닫기창 눌렀을 경우 로그아웃 처리
* beforeunload 는 크롬에서 정책상 막아놓아 동기호출이 안됨.
  * 비동기로 처리
  
```js
$(window).on('beforeunload', function(){	
  // logout code
});
```

* 참고
  * Synchronous XHR in page dismissal. See https://www.chromestatus.com/feature/4664843055398912 for more details.
  * https://developers.google.com/web/updates/2019/12/chrome-80-deps-rems
  * https://medium.com/@JackPu/solve-chrome-synchronous-xhr-in-page-dismissal-b2ae3bfc8a4a
