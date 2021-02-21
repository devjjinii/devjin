## serialize & serializeArray

~~~jsp
<form id="form">
  <input type="text" name="a" value="1" />
  <input type="text" name="b" value="2" />
</form>

$("#form).serialize();

// a=1&b=2


<form id="form">
  <input type="text" name="a" value="1" />
  <input type="text" name="b" value="2" />
</form>

$("#form).serializeArray();

// [{name : "a", value: "1"},{name: "b", value: "2"}]
~~~
