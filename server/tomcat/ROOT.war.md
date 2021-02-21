## ROOT.war

* war파일의 이름을 ROOT.war 로 하는 이유
  * 별다른 context 입력안하고 바로 붙을 수 있음. 
  * ex) localhost:8080/context이름 >> localhost:8080
  
* 톰캣 서버 > webapps 안에 ROOT 라는 폴더가 (디렉토리) 있음.
  * war의 이름은 ROOT.war 로 설정하면 코드들이 ROOT 라는 폴더에 풀림.
    * 톰캣페이지를 로딩하는 대신 현재 ROOT 폴더에 올라가있는 ROOT.war의 서비스를 실행함.
