### ANGULAR

* nodejs 설치 <br>
* angular cli 설치 <br>
-> npm install -g @angular/cli
* 버전 확인 <br>
-> ng --version
* 프로젝트 생성 <br>
-> ng new my-project
* 생성 되면 서버 띄우기 <br>
-> ng serve (4200포트)

~~~
파일 생성하고 vscode 열어서 ctrl + ~ (터미널 열기)
https://cli.angular.io/ 참조해서 
터미널에 npm install -g @angular/cli 입력
ng version 으로 버전 확인
>ng new front-end 생성
>YES
>SCSS

<app-root>
app.component.ts
app.component.html
app.component.scss(css)

> npm i @angular-devkit/build-angular 입력
(최근 angular 에서는 따로 설치를 해줘야 하는듯하다.)

> ng serve로 서버를 띄움 (코드가 수정되면 바로 반영된다.)

> ng build 모듈들이 번들링 해서 나온다. (dist 파일이 생성된다.)

해당 파일 가서 > npm install -g typescript
버전 확인 > tsc -v (tsc는 타입스크립트 명령어)

>tsc -init

예)
typescript 는 let num: number = 10; 
javascript 는 let num = 10; 

typescript( es6 보다 더 많은 기능을 제공한다.)

vscode 의 플러그인 중 angular files 설치 or angular cli 사용 하는 법 (ng generate component header 등..)

> ng generate component header  실행하면 html, ts, scss 자동으로 생성해 준다.  header
> ng g c footer 실행,    footer 도 자동으로 생성 된다. 
app.module.ts 에 headerComponent와 FooterComponent가 생성된다.
> ng g c section 실행,    section 도 자동으로 생성 된다.  (src 아래 app 아래에 생성)
>ng g c section/time-display
>ng g c section/buttons

section.component.html 에 <app-time-display>, <app-buttons> 추가한다.
~~~
