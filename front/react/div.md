## div id
~~~
서로 다른 컴포넌트에서 div id나 name으로 영역을 show , hide 할 수 있다.

--> 새로운 이벤트로 컨트롤해야하는 줄 알았는데, 하다보니까 
    onClick했을때, type id 가져와서 해당 div영역 id로 show(), hide() 가 먹힌다.
    
    
  if(type === 'abc') {
      $('div[name=abc]').show()
      $('div[name=abcList]').show()
      
      $('div[name=def]').hide()
   }    

~~~
