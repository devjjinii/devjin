## 프로젝트(folder or archive) import 시

* 이클립스
    1. Workspace 에서 마우스 우클릭
    2. Import -> import 클릭
    3. Projects from Folder or Archive 클릭

---

## SVN 연결할 때

* 이클립스 
* repo 추가 한 다음에 바로 check-out 을 하면 프로젝트명을 내가 설정할 수 없음.
    1. New Repository Location 에서 url 추가한 다음
    2. check-out 으로 받지 말고
    3. import 로 repo를 땡기면 프로젝트명을 바꿀 수 있음.

---

## Lib 가 Build Path에 적용 안되는 경우
* 이클립스] 프로젝트를 svn 에서 Import 했을 때 lib 디렉토리가 Build Path에 Web App Libraries로 추가 안되는 경우.
    * 메이븐 프로젝트 아님.
      1. 프로젝트 마우스 우클릭 -> Properties
      2. Project Facets -> Check Dynamic Web Module & Java Version & JavaScript Version
       3. 적용 -> 확인
       ![import](https://user-images.githubusercontent.com/53853730/113662442-13de2400-96e3-11eb-8dcf-55c776e26ea2.PNG)
