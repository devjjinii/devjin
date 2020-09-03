## @RequestParam

~~~
특정 파라미터를 받으려는데 필수가 아님  --> required = false
     --> dafaultValue = "" 옵션 추가 !!

       // 해당 파라미터가 반드시 필수 인지 여부, 기본값 : true
@RequestParam(value = "abc", required = false) String abc
@RequestParam(value = "abc", defaultValue = "") String abc                      
~~~
