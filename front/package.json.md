## package.json

~~~
We found a vulnerable dependency in a repository you have security alert access to.
  
* package.json의 의존성 문제 때문에 메일이 날아오는 것 같다.
  bot들이 넣어준 pull requests를 보고, merge를 해주면 된다. (편하다.) 
~~~

## package-lock.json

~~~
* package-lock.json 파일은 npm에 의해서 프로젝트의 node_modules나 package.json이 수정되는 경우 생성되거나 업데이트되며 
  당시 의존성에 대한 정보를 모두 가지고 있다.

* 다른사람들은 위해서 같이 커밋해줘야 한다. (node_modules 없이 배포하는 경우 반드시 필요)
~~~
