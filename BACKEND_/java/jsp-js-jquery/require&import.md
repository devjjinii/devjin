## require와 import의 차이

* require : 자바스크립트가 지원하는 패키지 읽는 방법
* import : es6의 사양으로 새로운 패키지를 읽는 방법

* import 
~~~javascript

var foo = require("foo"); // 모듈 전체를 import

import foo from "foo"; // 특정 함수 등 import -- es6
~~~

* export
~~~javascript
module.exports = foo; // 모듈 전체를 export
exports.foo = foo; // 함수를 직접 export

export default foo; // 모듈 전체를 export -- es6
export { foo }; // 함수를 직접 export -- es6
~~~
