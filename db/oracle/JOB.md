## 오라클 잡 스케줄러

* 테이블 생성
```sql
CREATE TABLE TB_TEST01(
    EXEC_TIME DATE
);
```

* 프로시저 생성
```sql
--CREATE OR REPLACE PROCEDURE 프로시져명
-- IS
-- BEGIN
--
--      수행할 쿼리
--      COMMIT;
-- END;

CREATE OR REPLACE PROCEDURE P_JOB_TEST01
IS
    BEGIN
       INSERT INTO TB_TEST01(EXEC_TIME)
       VALUES(SYSDATE);
    END;
```

* JOB 생성 (1분마다 실행)
```sql
--DECLARE
--   JOB_NO NUMBER;
-- BEGIN
--   DBMS_JOB.SUBMIT
--     ( job      => JOB_NO
--     ,what      => '호출할프로시져명();'
--     ,next_date =>  다음수행할 시간   --예) SYSDATE
--     ,interval  => '수행주기'        --예) 'SYSDATE + 1/24/60'
--     ,no_parse  => TRUE
--     );
--END;

DECLARE X NUMBER;
BEGIN
    DBMS_JOB.SUBMIT
    (   JOB => X
        ,WHAT => 'P_JOB_TEST01;'
        ,NEXT_DATE => SYSDATE
        ,INTERVAL => 'SYSDATE + 1/24/60'
        ,NO_PARSE => FALSE
    );
END;
-- COMMIT;
```

* 시간간격
```
SYSDATE+7 : 7일에 한번 
SYSDATE+1/24 : 1시간에 한번 
SYSDATE+1/24/60 : 1분에 한번
```

* JOB 관련 명령어
```sql
-- JOB 조회
SELECt * FROM USER_JOBS; 

-- JOB 삭제 (id)
BEGIN
    DBMS_JOB.REMOVE(63);
END;

-- JOB 실행 (id)
BEGIN
    DBMS_JOB.RUN(64);
END;

-- JOB 정지 (id)
BEGIN
    DBMS_JOB.BROKEN(63,FALSE);
END;

-- JOB 항목 변경
BEGIN
    DBMS_JOB.CHANGE(job, what, next_date, interval);
END;

```

* 확인
```sql
SELECT * FROM V$PARAMETER WHERE NAME LIKE '%job%'

-- VALUE가 0일경우 
ALTER SYSTEM SET JOB_QUEUE_PROCESSES= 10;

-- 값이 잘 들어가는지 확인
SELECT * FROM TB_TEST01 WHERE 1=1
ORDER BY EXEC_TIME DESC;
```

* 참고 사이트
    * http://hieehee.blogspot.com/2017/04/job.html
    * https://blog.naver.com/wizardol80/80155107071
