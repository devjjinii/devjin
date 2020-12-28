## SUBSTR

* SUBSTR 함수는 문자단위로 시작위치를 지정하여 길이만큼 문자열을 자름.
  * SUBSTR("문자열", "시작위치", "길이")

```sql
-- 20201228 >> 2020/12/28
SUBSTR(CONTACT_DT,0,4)||'/'||SUBSTR(CONTACT_DT,5,2)||'/'||SUBSTR(CONTACT_DT,7,2) AS "통화일자" 
```
