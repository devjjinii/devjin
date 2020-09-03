## div[contenteditable]

* 한시간 넘게 걸렸다.
~~~
* input 태그 말고 div 태그 안의 내용을 컨트롤하는 중,  Enter 입력시 (keyCode 13) 
  자꾸 <br><div></div> 이런식으로 태그가 먹히길래 구글링을 엄청해서 답을 얻었다.
  
// Enter시, br 막기
$('div[contenteditable]').keydown(function(e) {
    if (e.keyCode === 13) {
      document.execCommand('insertHTML', false, '<br>');
      //$('.button').trigger("click");
      return false;
    }
});
~~~


