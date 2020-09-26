## git fork 후 작업

##### [branch 생성 안하고 master로 진행]

1. git fork
2. git clone : 내 repo에서 실행 // 작업할 local 폴더를  정하고 clone

3. git remote -v. >> 작업할 local에서 실행
4. git remote add upstream “orginal branch” // 그리고  git remote -v로 확인 
 > upstream 이란 명칭으로 원격 저장소가 추가됨.

5. git fetch upstream : 원본 소스코드의 내용을 로컬에 내려받음. //동기화
 > fetch 와 pull의 차이 : 머지까지 자동으로 해주냐 안해주냐의 차이 (fetch는 머지 안해줌)
 // ex) 9728e52..621ff6a  master     -> upstream/master

6. git merge upstream/master
7.git push origin master

### 코드를 수정하거나 반영하기 전에 항상 동기화 해주는 습관 필요 :white_check_mark:
