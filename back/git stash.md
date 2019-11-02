### git stash
~~~
git stash : 하던 작업을 저장하고 가장 최근 commit 상태로 만든다. 
git stash pop / git stash apply : 저장되어 있는 작업중 가장 최근 stash를 가져온다.


branch를 하나 생성해서 기존에 작업하던 파일들을 저장해야했다.(기존 master에서 작업했다.)
master 에서 작업한것 stash에 저장하고 (git stash)
branch 변경(check out) 해서 stash pop 하면 해당 branch의 git staging 에 올라가 있다.
~~~

