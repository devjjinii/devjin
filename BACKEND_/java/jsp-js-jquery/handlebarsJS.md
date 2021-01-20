## handlebars.js


~~~javascript
<script id="template" type="text/x-handlebars-template">


{{#if (eq type 'abc')}}
 //...
{{else if (eq type '템플릿타입')}}
		{{#responseVo.localList}} --> 리스트로 내려오는 값  
			{{#if @last}}  --> 마지막 값
				{{title}},{{address}} --> 읽어줄 변수
			{{/if}}
		{{/responseVo.localList}}
 //...
 
{{else if (eq type '템플릿타입')}}
{{#if (eq dataList.length 0)}}
정보가 존재하지 않습니다.
{{else}}
  {{#dataList}}
    {{#if @last}}
      {{prettifyDate Dt}},{{abc}},{{def}} 입니다.
    {{/if}}
    {{/dataList}}
{{/if}}
//... 
{{else}}
{{/if}}

//여기서 prettifyDate는 사용자가 만든 함수인데, 함수 정의를 해줘야 한다

<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.4.2/handlebars.js"></script>

// 핸들바 템플릿 가져오기
var source = $("#template").html();
// 핸들바 템플릿에 바인딩할 데이터
var template = Handlebars.compile(source);

    Handlebars.registerHelper({
        inc : function(value,options) {
            return parseInt(value) +1 ;
        },
        prettifyDate : function (v1) {
            return v1.substring(0,4) + '-' + v1.substring(4,6) + '-' + v1.substring(6,8);
        }
    });
~~~
