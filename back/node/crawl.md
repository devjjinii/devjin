## 노드로 크롤링

* 모듈 설치
    * npm i cheerio
    * npm i request
* package.json 
    * "type" : "module" 추가
* 크롤링 할 영역 잡기
    ```
    table.list
        tbody > tr
    ```
* 즉시함수로 실행
    * npm run start (node index.js)
    
---

* index.js
```js
// import axois from 'axios'
import cheerio from 'cheerio'
import request from 'request'

// url 을 const options = {method: '' , url: ''} 으로 빼도 됨.

(function getData() {
    request('크롤링 할 url', function(err, res, body) {
        const $ = cheerio.load(body);
        
        $('.list tbody tr').map(function(i, e) {
            let project = String($(e).find('td.project').text());
            let tracker = String($(e).find('td.tracker').text());
            let status = String($(e).find('td.status').text());

            // console.log("프로젝트 [" + project + "]" + " ", tracker + " : " + "상태 : " + status)
            // 상태가 완료 제외하고  
            console.log(tracker);

        })

    })
})();
```
