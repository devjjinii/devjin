## like 절

* 오라클과는 또 다름.
  * `'%'`
```sql
<where>
    <if test="searchKeyword != null and searchKeyword !=''">
     AND B.TITLE LIKE CONCAT('%', #{searchKeyword}, '%')
    </if>
</where>
```
