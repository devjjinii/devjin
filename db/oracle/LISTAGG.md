## LISTAGG 함수 

* 오라클 11g 이상(>11.2.x) 사용 가능
  * 운영서버에서는 오류가 안나고 개발서버에서는 오류가 나는 황당한 현상 발생
    * 오라클 버전 차이
    ```sql
    SELECT * FROM V%VERSION;
    ```
* 그룹함수이기 때문에 GROUP BY 절과 함께 사용
```sql
SELECT
  LISTAGG([합칠 칼럼명], [구분자]) WITHIN GROUP(ORDER BY [정렬 칼럼명])
FROM TABLE;
```
