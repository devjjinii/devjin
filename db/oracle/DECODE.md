## DECODE 함수

* DECODE(컬럼, 조건1, 결과1, 조건2, 결과2, ......)
*  DECODE(컬럼, 조건, TRUE 결과값, FALSE 결과값)

```sql
--  ex, if (CODE == 'A') return 1,  아니면 0
DECODE(CODE , 'A' , 1 , 0) 
```

