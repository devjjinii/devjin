### NODEJS

~~~
workspace 에서 폴더 하나 생성 (프로젝트 폴더)

-> npm init
-> 필요한거 작성하고 enter
-> npm install express --save  
  (save는 이프로젝트가 의존하고 있는 외부라이브러리나 라이브러리가 표시가 됨_ package.json에 명시)
-> 그러면 package.json에 dependencies 가 생김 (express가 표현)
-> app.js 파일을 생성하고 
-> node app.js 로 실행한다.

구글에 node based web server 검색
-> express node install 검색

자동으로 파일변화를 감지해서 node서버를 restart를 해주는 nodemon
-> npm install nodemon --save

-> nodemon app.js 로 서버 실행

<<post>>
-> npm install body-parser --save
-> npm install ejs --save
-> npm install mysql --save
~~~
