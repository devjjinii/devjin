## foreach

~~~
$(document).ready(function() {
   var list = new Array();
   $("input[name= ___ ]").each(function(index, item){
	   list.push($(item).val());
   });
   alert(list);
});

~~~
