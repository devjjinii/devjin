## 확인창

```javascript
                          // 클래스명
$(document).on('click', '.class', function() {

  // 취소일 경우, 
  if(!confirm('_______ 하시겠습니까?')) {
    return false;
  }

  // 확인일 경우
  $.ajax({
        url : APIprefix + '/logout',
        type : "GET",
        data : {
          "":  ,
        },
        dataType : "json",
        contentType : "application/json",
        success : function(rs) {
            console.log(rs);
        }
    });
});
```
