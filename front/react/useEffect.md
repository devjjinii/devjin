## useEffect

~~~

페이지 진입했을때, 먼저 렌더링되는것을 원한다면 
useEffect 를 사용하자. 나는 페이지 진입시 api를 타는게 필요했다.


// 페이지 진입시 클릭효과
    useEffect(() => {
      const param = 'category_id=5'
  
       // cahnnelList
       dispatch(ajaxActions.getChannelList(param))
    }, []);
~~~
