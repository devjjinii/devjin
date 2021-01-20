## sql dump & backup

* 테이블 백업하는 방법
  * 대용량은 insert 대신에 insert.sql 파일로 진행
  * bash$.. >>> psql -h 호스트 -d 데이터베이스 -U 소유자 -f 파일있는경로(예: /home/tb_abc.sql)