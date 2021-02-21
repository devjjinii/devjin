## axios

```javascript
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
```