## SEQUENCE

* 시퀀스 생성
```sql
create sequence seq_테이블 이름-필드이름
 increment by n   <== 증가값 (default 1)
 start with n   <== 시작값 (default 1)
 maxvalue n | nomaxvalue  <== 최고값 (nomaxvalue default 10*E27)
 minvalue n | nominvalue  <== 최소값 (nominvalue default 1)
 cycle | nocycle   <== 최소,최고값이후 값의 생성유무 (default nocycle)
 cache | nocache   <== 메모리에 유지할 값의 수 (default 20)
```

* 시퀀스 삭제
```sql
drop sequence seq_bbs_no;
```
