### redis 오류
~~~
스케러가 돌지 않는 것 같아서 로그를 확인해 보았다.

다음과 같은 오류가 났다.
MISCONF Redis is configured to save RDB snapshots, but it is currently not able to persist on disk.
Commands that may modify the data set are disabled, because this instance is configured to report errors during writes if RDB snapshotting fails....


-> 레디스 설치된 경로로 가서 config 파일가서 stop-writes-on-bgsave-error yes 부분을 no로 변경해준다. (캐시용으로 사용) 
-> 다시 확인해봐야 할 것 같다.
~~~
