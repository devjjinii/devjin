## 이벤트 버스


* Vue에서 컴포넌트 간 기본적으로 데이터를 통신하는 방법은 props와 events가 있음.
    * 복잡해지는 경우는 이벤트 버스를 이용.

1. 직접 Event Bus.js 파일을 만들어서 import 하는 방법이 있고,
    * 장점 : 부모-자식 사이가 아니여도 사용이 가능하다.
    * 단점 : 많이 쓰는경우 관리가 힘들다.
2. Vue 에 내장되어 있는 Event Bus를 이용하는 방법이 있다.
    * 장점 : 부모-자식 관계이기 때문에 함수의 위치가 정확하다.
    * 단점 : 타고타고 가면 복잡해진다.
    

```javascript
import Vue from 'vue'
const EventBus = new Vue();

export default EventBus;
```

*  $emit : 이벤트 호출 // $emit('이벤트 이름', option)
*  $on : 이벤트 받는 컴포넌트에서 사용할 Event Bus를 등록
*  $off : 컴포넌트가 사라질 때 이벤트를 삭제