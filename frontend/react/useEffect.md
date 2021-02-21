## useEffect

* 페이지 진입했을때, 먼저 렌더링되는것을 원한다면 useEffect 를 사용
    * 페이지 진입시 api를 타는게 필요했다.

```javascript
// 페이지 진입시 클릭효과
    useEffect(() => {
      const param = 'category_id=5'
  
       // cahnnelList
       dispatch(ajaxActions.getChannelList(param))
    }, []);
    

useEffect(() => {
    dispatch({
        type: .....
    })
},[]);  // 최초 렌더링이 될때만 실행


useEffect(() => {
    set....(index);
},[index]); // 해당 배열의 값이 변할때만 실행
```
