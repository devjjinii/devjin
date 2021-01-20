## webpack.config.js

~~~
module.exports = {
    entry:  // 입력 파일 경로 , 번들 작업할 파일
    output: {
        // 출력 디렉터리와 파일 이름, 번들화 된 파일 경로
    },
    module: {
        rules: [
            {
              // 로더 등록  
            },
        ]
    },
    devServer: {
      // 개발 서버 설정 
    },
    plugins: [
         // 플러그인 등록
    ]
}
~~~
