## 주피터 노트북 경로 설정

~~~
cmd 에서 jupyter notebook --generate-config 입력한다.

c:\Users\사용자이름 > .jupyter 파일이 생긴다.

jupyter_notebook_config 파일을 열어서  #c.NotebookApp.notebook_dir 부분을 원하는 폴더경로로 수정한다.
c.NotebookApp.notebook_dir = 'D:\jupyter_project'

jupyter notebook 마우스 우클릭 > 속성에서 %USERPROFILE% 에 설정해준 경로를 적는다. (D:\jupyter_project)

~~~
