## ROLLUP

* GROUP BY 쿼리에서 ROLLUP 함수를 사용하면 소계, 합계(총합)를 구할 수 있음.
```sql
SELECT 컬럼
, COUNT(*) AS TOT
FROM 테이블
WHERE 조건
GROUP BY ROLLUP(컬럼)
```

* ROLLUP 시 컬럼에 NULL (총합) 을 '합계' 로 표시하기
  * DECODE 함수를 이용
    ```sql
    -- DECODE('컬럼', NULL, '합계', '컬럼') AS .....
    
    SELECT DECODE(컬럼,NULL,'총합',컬럼) AS 컬럼
    , COUNT(*) AS TOT
    FROM 테이블
    WHERE 조건
    GROUP BY ROLLUP(컬럼)
    ```
* ROLLUP 할 때, 소계말고 합계만 표시하고 싶은 경우
  * 괄호 추가
    ```sql
     GROUP BY ROLLUP((컬럼,컬럼)) -- 괄호를 추가해주면 됨.
    ```
