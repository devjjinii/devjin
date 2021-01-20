## 주피터 노트북 경로 설정

* 터미널에서 jupyter notebook --generate-config 입력.
* c:\Users\사용자이름 > .jupyter 파일이 생김.
* jupyter_notebook_config 파일을 열어서  #c.NotebookApp.notebook_dir 부분을 원하는 폴더경로로 수정.
    * c.NotebookApp.notebook_dir = 'D:/jupyter_project'
* jupyter notebook 마우스 우클릭 > 속성에서 %USERPROFILE% 에 설정해준 경로를 적음. (D:\jupyter_project)