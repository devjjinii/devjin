### REST API

~~~
<<RESTful API>>
1. 웹을 근간으로 하는 http protocol 기반이다. 
2. 리소스는 uri 로 표현하며 고유해야 한다.
3. uri는 단순하고 직관적인 구조이어야 한다.
4. 리소스 상태는 http methods 를 활용해서 구분한다.
5. xml/json 을 활용해서 전달한다.
~~~
~~~
<<crud>>
1. create(post)
2. retrieve(get)
3. update(put)
4. delete(delete)
~~~
~~~
<<api design>>
1. 복수명사를 사용한다. (/users)
2. 필요하면 url 하위 자원을 표현한다. (/users/1)
3. 필터조건을 사용할 수 있다.(/users?state=login)
~~~
