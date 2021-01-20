## axios 

~~~
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
  
 console.log 가 안찍혀서 확인해보니.. 
 
 useEffect(() => {
    async function getData() {
      await dispatch(getABC())
    }
    getData()       //*************** 여기
  }, []);
  
  
 useEffect 할때, getData() 선언만 해주고 주석부분에 getData() 추가 안해줬다.
 --> getData() 호출하니 완전 잘 찍혔다.
 
 options 바꿔보고 진짜 1시간 뻘짓하였다.
~~~
