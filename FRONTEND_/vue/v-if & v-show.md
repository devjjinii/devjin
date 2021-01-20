## v-if & v-show

~~~
v-if는 <!---->로 처리되어 아예 렌더링이 되지 않고,  
v-show는 실제로 코드는 삽입되지만 display: none 되어 스타일로 보이지 않도록 처리가 된다.


조건에 따라만 실행하고 싶다면 v-if를 사용하고, 
코드는 있지만 스타일로 display: none 처리를 하고 싶다면 v-show 를 사용하는 것이 바람직하다.

v-show : true / false
~~~
