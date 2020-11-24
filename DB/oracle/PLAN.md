## ORACLE EXPLAIN PLAN

* 쿼리의 성능을 비교 > 쿼리를 최적화하는 데 도움.
  * SQL 문이 어떻게 실행되고 작동하는지를 점검하기 위한 기능.
  * 툴마다 기능을 제공하고 있고 DATAGRIP 같은 경우는 쿼리 우클릭 > Explain plan 으로 확인 가능.

* CPU_COST 와 IO_COST 의 차이점
  *  IO_COST is "proportional to the number of data blocks read by the operation", CPU_COST is "proportional to the number of machine cycles required for the operation"

* CPU_COST 가 낮을수록 좋은 성능을 예상. 하지만 COST 수치가 더 높은 SQL문이 빠른 경우가 있음.

* 참고 : https://docs.oracle.com/database/121/REFRN/GUID-0CAFEAD1-8C79-4200-8658-947D04BDFFE2.htm#REFRN29510
