## 테이블 스페이스

* 테이블이 저장되는 공간
  * 오라클 에서는 테이블스페이스 라고 해서 테이블이 저장될 공간을 먼저 만들고 나서 테이블을 생성

* 전체 테이블 스페이스 조회
```sql
SELECT * FROM DBA_TABLESPACES;
```

* 전체 테이블 스페이스 경로 및 용량 조회
```sql
SELECT    A.TABLESPACE_NAME "테이블스페이스명",
          A.FILE_NAME "파일경로",
           (A.BYTES - B.FREE)    "사용공간",
            B.FREE                 "여유 공간",
            A.BYTES                "총크기",
            TO_CHAR( (B.FREE / A.BYTES * 100) , '999.99')||'%' "여유공간"
      FROM
       (
         SELECT FILE_ID,
                TABLESPACE_NAME,
                FILE_NAME,
                SUBSTR(FILE_NAME,1,200) FILE_NM,
                SUM(BYTES) BYTES
           FROM DBA_DATA_FILES
         GROUP BY FILE_ID,TABLESPACE_NAME,FILE_NAME,SUBSTR(FILE_NAME,1,200)
       ) A,
       (
         SELECT TABLESPACE_NAME,
                FILE_ID,
                SUM(NVL(BYTES,0)) FREE
           FROM DBA_FREE_SPACE
        GROUP BY TABLESPACE_NAME,FILE_ID
       ) B
      WHERE A.TABLESPACE_NAME=B.TABLESPACE_NAME
         AND A.FILE_ID = B.FILE_ID;
```
