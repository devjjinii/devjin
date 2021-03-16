## MERGE INTO 문

* 데이터(값)가 있으면 UPDATE 하고 없으면 INSERT
   * 편리하나 잘못사용했을 때 삭제나 수정되면 안되는 기존 데이터가 업데이트 됨.

```sql
MERGE INTO A_TABLE A -- update 또는 insert할 테이블 혹은 뷰
  USING (
    SELECT * FROM TABLE
    WHERE ... 조건
  ) B -- 비교할 대상 테이블 혹은 뷰[TABLE / VIEW / DUAL] // (위 테이블과 동일할 경우 DUAL을 사용)
  ON (A.id = B.id) -- [조건]
  WHEN MATCHED THEN   -- 조건이 일치하면 UPDATE
    UPDATE SET
    [COLUMN1] = [VALUE1],
    [COLUMN2] = [VALUE2],
    .....
  WHEN NOT MATCHED THEN -- 조건이 불일치하면 INSERT
    INSERT (COLUMN1, COLUMN2, ...)
    VALUES (VALUE1, VALUE2, ...)
```
