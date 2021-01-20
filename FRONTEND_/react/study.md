### study_react

* node 설치, npm 버전 확인
* react 프로젝트 생성
    * npm install -g create-react-app
    * react-app 폴더 생성
    * create-react-app .
    * npm run start

* deploy
    * build -> npm run build (용량을 줄여준다.)
    * npm install -g serve  or  npx serve -s build 

---
* class -> className
* 컴포넌트 : redner function // render :  뭔가를 보여주는, 출력기능
* react : UI 라이브러리,   reactDOM : 웹사이트에 redner 하는 것을 도와주는 모델
* reactDOM 은 한개의 컴포넌트를 출력하고 다큐먼트 안의 엘리먼트 아이디는 페이지(html)
* 컴포넌트 생성 > 렌더 > 리턴 > jsx (// html )
* import react > class > render > return something
* 2 concept > state & props
* props >> 
* jsx 명령 > { } 필수
* array -> map!  {abc.map(ABC , index => {})  // key = unique (ex, index) ,  id값 
* React.propTypes.string  .isRequired
* Lifecycle
* state : this.state.abc  = '' -> do not mutate state directly.
* componentDidMount() {    /// ...this.state.movies -> 이전 리스트는 그대로 둔다 }
* state = {} 
* function 만들때, _ 언더스코어 활용도 괜찮다. ( react 일반 기능과 구분자로.)
![캡처](https://user-images.githubusercontent.com/53853730/79624911-1d801c00-8160-11ea-826c-f5f21cd2154e.JPG) <br>
* smart component -> have state // dumb component -> have not state
![캡처](https://user-images.githubusercontent.com/53853730/79625023-f7a74700-8160-11ea-836a-036c30dd7036.JPG) <br>
* 차이점 : 밑의 코드는 그냥 return 을 하기 위해 존재하고 state를 가지고 있지 않다. , 라이프사이클이 없고 render가 없다.
* api : componentDidMount() { fetch(url) }  -> console.log () --> promise
* promise = asynchronous
* fetch() .then(response => console.log(response)) .catch(err => console.log(err))
* await, async <br> 
![image](https://user-images.githubusercontent.com/53853730/79629432-bcb70a80-8184-11ea-98d1-9220cd9a4196.png) <br>

