## SVN LOCK 걸린 경우

* DB sqlite 설치
* 프로젝트의 .svn 폴더의 wc.db 파일 열어서 `DELETE FROM WC_LOCK; DELETE FROM WORK_QUEUE;` 후 파일 저장
  * 저장안하면 BUSY 걸림
* Team -> CleanUp
  
* 참조 : https://blog.naver.com/kalin7744/221895252810
