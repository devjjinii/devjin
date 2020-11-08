## MySQL 설치 및 설정

#### MAC 기준
 * brew update
 * brew search mysql
 * brew install mysql
   * 접근 오류나면 sudo chown -R "내 계정" "허용시킬 경로" (ex. /usr/local/..)
   * brew list
 * 서버 시작 >> mysql.server start 
 * 비밀번호 설정 >> mysql_secure_installation
   * No > 쉬운 비번으로 설정
 * Remove anonymous users? (Press y|Y for Yes. any other key for No)" >> Yes 설정
   * "mysql -u root"처럼 -u 옵션 필요
 * Disallow root login remotely? (Press y|Y for Yes, any other key for No >> Yes 설정
   * 다른 IP에서 root 아이디로 원격접속을 불가능
 * Remove test database and access to it? (Press y|Y for Yes, any other key for No) >> Yes 설정
   * test DB 제거
 * Reload privilege tables now? (Press y|Y for Yes, any other key for No) >> Yes 설정
 * 접속 >> mysql -u root -p 
    * 비번 입력 후 mysql> status;
    * 설정 utf8 로 변경!!
 * 사용자 추가 > create user '사용자id';
    * create user 사용자id@localhost identified by '비밀번호';  
  * 데이터 베이스 생성
    * create database "데이터베이스명" default character set utf8mb4;
  * DB권한 부여
    * grant all privileges on `*.*` to 'userid'@localhost;

---
* 참고 : https://whitepaek.tistory.com/16
