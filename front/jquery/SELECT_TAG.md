## SELECT TAG

* name 값을 가져오는 방법
```jsp
<select id=.... >
  <option value=... name=...>
  <option value=... name=...>
  <option value=... name=...>
</select>

$('#셀렉트ID').find('option:selected').attr("name");
```
