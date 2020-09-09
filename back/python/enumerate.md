## enumerate & for

* enumerate는 각 아이템의 인덱스를 포함한다.
* range로 루프를 돌고 인덱스를 접근하는 것보다 enumerate를 사용한다.
* 시작 번호도 지정할 수 있다.

~~~
for num,title in enumerate(titles):
    item = Item()
    item['title'] = title
    item['price'] = prices[num]
    ...//
    
{'price': '', 'title': ''}
~~~
