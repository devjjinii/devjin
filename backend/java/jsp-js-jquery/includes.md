## includes

* 해당 배열에 원하는 값이 있는지 확인하는 법
~~~javascript
const data = []

if(data.includes(원하는 값) == true) {   // 있으면
    $("#myFavoriteButton").attr('aria-pressed', true)
} else {  // 없으면
    $("#myFavoriteButton").attr('aria-pressed', false)
}
~~~
