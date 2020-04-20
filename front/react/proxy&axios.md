## proxy & axios

~~~
API 불러오는 과정에서 cors 오류로 인해 삽질을 했다.

cors 해결 하면, content-type 에서 415 오류가 났다. 
-> (fecth로 진행했을시에 , mode : no-cors 로 하면 415 오류 --> no-cors 로 해서 text/plain으로 들어간다.)

해결 방법은 
1. fetch에서 axios 를 쓰기로 결정했다. 
2. package.json에서 "proxy" : "url" 을 추가한다.
3. const options= {
      method: 'POST',
      headers: { 'content-type': 'application/json'},
      data: {
        "keywords": "ABC" // 추가
      },
      url : '/search/channel/abc' // proxy 에 추가한 url 뒷부분 추가
   }
      Axios(options)
      .then(response => console.log(response.data)) // response.data.program_nm
      .catch(err => console.log(err))

 --> post는 이런식으로 진행했다. (ES6 버전이라나..)
              
결론은 API 데이터는 가져오긴 했다.              
~~~
