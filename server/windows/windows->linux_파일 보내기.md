## 윈도우 (내 로컬) 에서 리눅스 (서버) 로 파일 보내기 :: Local -> Remote

* scp [options ...] [source] [target]
* scp [보낼 파일(경로)] [유저명]@[주소]:[저장할 경로(목적 디렉터리)]
* -r 옵션 :  하위 디렉토리 및 파일 모두 복사함
    test.txt와 같이 하나의 파일만 보낼 것이라면 -r 옵션 생략이 가능.
