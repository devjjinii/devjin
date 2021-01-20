## data-type

~~~javascript
console.log(typeof null)  //object
console.log(typeof []) //object
console.log(typeof new RegExp('/')) //object

var array = [1,2,3,4,5,6,7,8,9];
var result =
  array.map(v => v * 10 )
       .filter( v => v > 10) // true 인것만
      //  .map(v => v + '')  // string으로 
       .reduce((acc,item) => {
         acc = acc + item;
         return acc;
       })

  // {return !!} 
       // map reducer 

  console.log(result) 
~~~
