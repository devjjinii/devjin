## substring

~~~
substr => .substr()은 문자열에서 특정 부분만 골라낼 때.. 

 const subStr = (data) => {
    // 1234
    return data.substr(0,2) + ":" + data.substr(2,2)
}

이런식으로 쓰려했으나, undefined 오류가 나길래 저 data 가
string 이 아닐 수도 있겠다 라는 생각이 들었다. 

역시나였다.

var start = String(data); 하고나서
var end = String(data);

return start.substr(0,2)+":"+start.substr(2,2) + "~" + end.substr(0,2)+":"+end.substr(2,2)

잘나온다.


var 변수 = String(숫자);    // 숫자를 문자로 변환..
var 변수 = 숫자 + "문자열";    // 숫자와 문자열을 한 문자열로..
~~~
