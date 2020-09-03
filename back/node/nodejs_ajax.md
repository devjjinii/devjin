## 그냥 js 파일에서 바로 ajax 사용

~~~
검색해보니까 jsdom 이라는게 있었다.

JSDOM은 nodejs 환경에서 브라우저 DOM에 접근하기 위해서 사용한다고 한다.

npm i jquery
npm i jsdom

var jsdom = require('jsdom');
const { JSDOM } = jsdom;
const { window } = new JSDOM();
const { document } = new JSDOM("").window;
global.document = document;
var $ = require('jquery')(window);


 $.get("url......", data => {

        // console.log(data);
        //var obj = JSON.parse(data)
        //console.log('지역 : ' + obj.name + ' 온도 : ' + String((obj.main.temp) - 273).substr(0,3)  + " 도 입니다.");

    })
~~~
