## event, this

~~~
 $('.abc').on('click', function(){
    console.log("devjjinii");
    $(this).parent().parent().append();
  });   -> this가 잘먹히는데
 
-->  js 파일에서 작업할때, click 이벤트가 먹히지 않았다.
===> 해결 방법 : this --> e로 수정!!!!

함수 사용할때는 , ABC(this, keyword);

 ABC : function(e, keyword) {  // e를 파라미터로 넘겨준다.
    console.log(keyword)
    
    // 기존의 $(this)...... -> $(e)로
    $(e).parent().parent().append();
 },
 
~~~
