### NODE + VUE

~~~
<<Node.js>>
# 7000 port : nodemon index.js

npm i express 
npm i ejs   // tymeleaf , jsp 
npm i body-parser // http 요청이 들어올 때, json ,파싱
npm i mysql // mybatis 
npm i nodemon -g //전역으로 ,  개발하기 편리함(auto-reload)

node_moduels   ejs 가 사용하는 관련 라이브러리를 한번에 다운받음
package-lock.json  의존성
package.json

npm i bluebird

(utils.js)
썸네일이랑 글         암호화     해시맵
open-graph-scrper, crypto-js,  hashmap

npm i socket.io --save
socket.io  (웹 기능, 채팅 기능)
보통 standalone으로 사용하지 않음.
소켓으로 들어온 데이터를 웹서버(http)도 알아야 해서, db 연동도.

socket io를 on  off 시키는 개념.

cli : command line interface


#### webpack ####
npm i webpack -g
npm i webpack-cli -g

npm i webpack-node-externals --save-dev  -> dev는 서비스 할때 말고 개발할때만 사용하겠다.

vue , angularjs , react 
webpack 으로 패키징 한다.
브라우저에서 쉽게 쓰기 위하여.(충돌 걱정안해도 되고)
<<webpack>> 을 알아야 한다.

MVVN (model view viewModel pattern)

---------------------------------------------------------------------------------------------------

<<Vue.js>>
###### Install Vue.js ######
npm i @vue/cli -g
npm i @vue/cli-service-global -g  //global 전역변수 아무데서나 설치 가능
vue --version //버전 체크

##크롬에서 vue.js devtools 확장 프로그램 설치.
vue cli. 

1.app.vue    --파일 확장자 잘 맞춰주기.
vue serve   (--o) 해주면 브라우저 까지 띄움.
포트 바꾸는법  // vue.config.js 활용

2. vue create ___ <   : vue create hello
vue ui

npm  run serve

v-on -> @으로 바뀜    v-on=@

vue add router  (App.vue 라우터로 전환)

컴포넌트 방식(개발)

이중 중괄호(mustaches)

******computed와 watch******
 computed  : 변수 바라 보기  property  라 return 이 필요함
 watch 는 함수라 return이 불필요함. 

computed setter ( get 과 set을 분리 할수 있음.)
true or false 인것만  -> filter 이용  (for 문에서 loof 라 생각)

once(한번만) , passive 줘야 한다.

lodash(**debounce**) , axios(ajax call) , Router, EventBus, Mixin

hello 프로젝트에서 npm i axios --save

//	app.get('/apis/comment/:bno' , (req, res) => {
//		let bno = req.params.bno;
//		let mydb = new Mydb(pool);
//		mydb.execute( conn => {
//			conn.query("select * from comment where //bno=?", [bno], (err, ret) => {
//				res.json(ret);
//			});
//		});
//
//	});

explor 10 이하 오류 : promise 

--axios
npm i es6-promise --save  설치
sebpack.config.js 에 require('es6-promise').polyfill(); 추가
--router
router.js 페이지 변경 할때, router (component) 필요 
--lodash
//자바 스크립트 사용하는데는 거의 쓴다보면됨 ._
npm i lodash --save
--eventbus (뷰 이용해서 사용)
부모와 자식, 자식과 자식,
-- _global.js
--mixin   (import 를 편리하게 해줌 ) utils.js 와 같이 선언 


(survey, surveyee, question, answer 테이블 생성- DB (nodevue repo)

vue create survey -n (no git) , babel, router
npm i --save lodash axios

free template >> mdbootstrap
~~~
