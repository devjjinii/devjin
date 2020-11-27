## `<if test ..... ></if>`

* 동적쿼리
* , 가 `<if></if>` 안에 있어야 함.

```sql
<if test="SUBJECT !='' and SUBJECT != null">
  ,SUBJECT
</if>

<if test="SUBJECT !='' and SUBJECT != null">
 ,#{SUBJECT}
</if>
```
