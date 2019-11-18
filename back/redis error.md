### redis 오류
~~~
스케줄러가 정상작동 하지 않는 것 같아서 로그를 확인해 보았다.

다음과 같은 오류가 났다.
MISCONF Redis is configured to save RDB snapshots, but it is currently not able to persist on disk.
Commands that may modify the data set are disabled, because this instance is configured to report errors during writes if RDB snapshotting fails....

1. 첫번째 방법
======================================================================================================================
-> 레디스 설치된 경로로 가서 config 파일가서 stop-writes-on-bgsave-error yes 부분을 no로 변경해준다. (캐시용으로 사용) 
-> 다시 확인해봐야 할 것 같다. (실패)

2. 두번째 방법
======================================================================================================================
redis.conf 에서 requirepass (password)

>redis-server redis.conf
>redis-cli

127.0.0.1:6379 > set a 1
             	 > AUTH password
	             > set a 1

-> 이 문제가 아니었다. 

======================================================================================================================
root  계정으로 띄웠어야 했는데 solr 계정으로 띄워서 문제가 발생했다.
전에 서버 재시작 시에, 

redis-server  로 띄웠는데  --> default config를 물고가서 -> 인증 체크를 안했다.
> src/redis-server redis.conf 로 띄워줘야 한다. ( root에서 )
-> ok!!
~~~
