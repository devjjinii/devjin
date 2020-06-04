## sql dump & backup

~~~
개개의 테이블을 백업하는 방법. 
  -> 만 건 정도의 데이터를 insert문으로 직접 날리니까 뒤의 데이터가 잘려서 들어가지 않았다.
  
해결 방법 : insert문만 있는 sql 파일로 진행..
bash$.. >>> psql -h 호스트 -d 데이터베이스 -U 소유자 -f 파일있는경로(예: /home/tb_abc.sql)
~~~
