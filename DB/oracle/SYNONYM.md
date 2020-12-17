## SYNONYM

*  내 계정에서 다른 계정의 특정 테이블을 내 계정에서 볼 때 Alias 를 정해놓고, 그 테이블을 참조할 때 Alias로 참조
  ```sql
  SELECT * FROM A.TABLE;  -- A(A계정?)가 노출되는 보안상의 문제
  ```
  
  ```sql
  CREATE OR REPLACE SYNONYM AA FOR A.TABLE;
  
  SELECT * FROM AA; --- A.TABLE 를 조회하는것과 같음.
  ```
* 쿼리문 길이 및 보안유지를 위해 SYNONYM 사용
* 계정 권한 주기
  ```sql
  GRANT INSERT, SELECT ON TABLE TO ORACLE; -- 오라클 계정에게 TABLE 테이블의 SELECT 권한 부여
  ```
