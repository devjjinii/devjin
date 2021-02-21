## axios 

```javascript
 export const getABC = () => (dispatch) => {

    const options= {
      method: 'POST',  //get 인지 post 인지
      headers: { 'content-type': 'application/json'
              },
      data: {
        "a":"1",
        "b":"10"    // body 부분
      },
      url : 'http://localhost:8080/~~~' // api url
  }
    Axios(options)
      .then(response => {
        console.log(response.data)
          dispatch({
            type: TYPE_NAME,
            payload: response.data
          })
      })
      .catch((error) => {
        console.log(error)
        dispatch({
          type: TYPE_NAME,
          payload: error
        })
      })
  } 
  
 
 useEffect(() => {
    async function getData() {
      await dispatch(getABC())
    }
    getData()       //*************** 호출
  }, []);

```