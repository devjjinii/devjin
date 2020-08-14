## webpack 설정

* 프로젝트에 있는(다른 개발자가 만들어놓은) webpack을 사용했는데, 나도 한번 만들어보고 정리해볼 필요가 있어서 공부해본다.
~~~
* 모듈로 로딩해서 사용한다.


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

~~~

* 아직은 자세하게는 모르지만 더 알게된다면 추가해본다.
