## redis error

* MISCONF Redis is configured to save RDB snapshots, but it is currently not able to persist on disk.
Commands that may modify the data set are disabled, because this instance is configured to report errors during writes if RDB snapshotting fails....

	* 첫번째 방법
		* 레디스 설치된 경로로 가서 config 파일가서 stop-writes-on-bgsave-error yes 부분을 no로 변경해준다. (캐시용으로 사용)

 	* 두번째 방법
		```
			redis.conf 에서 requirepass (password)
			>redis-server redis.conf
			>redis-cli

			127.0.0.1:6379 > set a 1
            > AUTH password
	        > set a 1
		```

* 계정 (root)
	* 지정된 계정으로 띄웠어야 했음.
	* 서버 재시작 시에 redis-server  로 띄웠는데  --> default config를 물고가서 -> 인증 체크를 안함..
		* src/redis-server redis.conf 로 띄워줘야 함 (root)
