## CTE

* CTE(Common Table Expression)는 서브쿼리로 쓰이는 파생테이블(derived table)과 비슷한 개념으로 사용.
	* CTE와 비교대상 :  VIEW
	* CTE는 주로 복잡한 쿼리문에서 코드의 가독성과 재사용성을 위해 사용.
```sql
WITH
변수명1 AS(
		쿼리1
		SELECT * FROM TB_.....
	),
변수명2 AS(
		쿼리2
		SELECt * FROM TB_......
	)
SELECT .... FROM 변수명1 .... 
``` 
