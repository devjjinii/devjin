## div id

* 서로 다른 컴포넌트에서 div id나 name으로 영역을 show , hide 할 수 있다.
  * onClick했을때, type id 가져와서 해당 div영역 id로 show(), hide().
    
```javascript
  if(type === 'abc') {
      $('div[name=abc]').show()
      $('div[name=abcList]').show()
      
      $('div[name=def]').hide()
   }    
```
