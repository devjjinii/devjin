## word-wrap

~~~
<< 줄바꿈 style >>

word-wrap 은 긴 텍스트를 강제로 자를 것인지에 대한 옵션이다.
이 속성이 누락되어 있으면 보통 긴 URL이 엘리먼트 밖으로 삐져나오게 된다.
normal 과 break-word 옵션이 있고, 줄바꿈을 적용할 것이라면 break-word 를 할당하면 된다.

word-break 는 줄바꿈을 어떻게 할 것인지에 대한 옵션이다.
아시아/비아시아 언어 기준으로 구분되지만, 간단하게-
한글을 포함해 단어 기준으로 줄바꿈하려면 keep-all 을,
글자 단위로 모두 자르려면 break-all 을 쓰면 된다.

줄바꿈을 적용하려는 엘리먼트는 (당연히) width 가 제한되어 있어야 한다.

- 줄바꿈을 할 건데, 글자 단위로 모두 자를 생각이라면,
  word-wrap: break-word;
  word-break: break-all;

- 줄바꿈을 할 건데, 단어 단위로 자를 생각이라면,
  word-wrap: break-word;
  word-break: keep-all;
  
참고 : https://ohgyun.com/680
~~~
