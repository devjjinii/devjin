## axios
~~~
요즘 프론트 작업때매 바쁘다.. 퍼블은 jsp로 나오는데.. 왜 react로 변경하는지.....
퍼블이 react로 나온것도 아냐.....
심지어 api도 다 제공이어서.. 갖다붙히기만 하면 되는작업...

그래도 react를 조금씩 알아가는 것 같아서... 다행이다.


get은 또 연결이 안되서 뻘짓하다가 찾았다. post랑 데이터 넘겨주는 형식이 다른가 보다..

 // 카테고리별로 채널 선택
  export const getChannelList = (data) => (dispatch) => {
    
   Axios
   .get(`http://localhost:8080/abcccdfdfd/dfdf?${data}`)
   .then(response => {
      console.log(response.data.data.list[0].list_channel)
    
      dispatch({
        type: CHANNEL_LIST,
        payload: response.data.data.list[0].list_channel
    })

   })  
  .catch((error) => {
    dispatch({
      type: CHANNEL_LIST,
      payload: error
    })
  })

  }
  
 //함수 호출 부분 (click시)
 
 const param = `category_id=${e.currentTarget.id}`
 // cahnnelList
 dispatch(ajaxActions.getChannelList(param))
  
~~~
