## webpack 설정

* 프로젝트에 있는(다른 개발자가 만들어놓은) webpack을 사용했는데, 나도 한번 만들어보고 정리해볼 필요가 있어서 공부해본다.

* 여러개의 js, css, png, jpg 를 웹 브라우저가 이해할 수 있는 번들로 묶고 패킹할 수 있는 자바스크립트 모듈 번들러.
  
* 사용 이유 : 스크립트 로딩 순서와 해당 HTML에서 필요하지 않은 js 파일들까지 로딩하여 리소스 낭비가 생겨 필요한 파일만 로딩하고 관리하고자 사용한다.

* 모듈로 로딩해서 사용한다.

```json
entry: entryPath, // 엔트리 (시작점) :  ex) /src/index.js

output: { // 아웃풋 : dist 폴더의 bundle.js 파일로 결과를 저장 
          // 이때, index.html 에서 불러서 사용한다.  ex) <script src="./dist/bundle.js"></script>
        filename : 'bundle.js',
        path: path.resolve(__dirname, 'dist'),
        publicPath: '/dist'
},

module : {
    rules : [{
        test:  /\.m?js$/,
        include : path.resolve(__dirname,'src'),
        use: { // 바벨 로더  ex) js, css
            loader : 'babel-loader',
            options: {
                presets: ['@babel/preset-env']
            }
        }
    }]
},

 plugins : []  // 플러그인
```