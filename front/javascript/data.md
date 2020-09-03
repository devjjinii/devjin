## date

~~~
// 타임라인, 지금 동영상이 몇 % 진행됬는지 
percentage : (start, end) => {
  var today = new Date()

  var minutes = today.getMinutes() < 10 ?  "0"+ today.getMinutes(): today.getMinutes() 

  var now_time = (today.getHours() + ":" + minutes).replace(/\:/g,'')
  var start_time =  start.replace(/\:/g,'')
  var end_time = end.replace(/\:/g,'')

  var percent = Math.round((now_time - start_time) / (end_time - start_time) * 100)

  return percent
}
  
var temp = moment(today).format('YYYY-MM-DD')  
var yesterday = temp.replace(/\-/g,'')  

~~~
