### solr config (collection 추가) 로컬에서 추가
~~~
1. tb_test 테이블을 생성한다.
2. 데이터를 insert 한다.
3. D:\...\solr\solr-config 에 test-conf 파일을 생성한다. 
4. D:\...\solr\solr-config\test-conf\data-configs 에 test-config.xml 파일을 생성한다.
5. test-config.xml 에 dataConfig 설정하고, 쿼리랑 컬럼을 명시해준다.
6. schema.xml 에 test table 에 관한 meta fields 추가해준다.
7. solrconfig.xml 의 DataImportHandler  에  test-conf.xml  추가한 것을 명시한다.
~~~

#### 기존 config 파일 업로드 & 학습
![기존 config 업로드   재학습 2](https://user-images.githubusercontent.com/53853730/65474623-8697fd80-deb7-11e9-9e44-e94774aca86f.jpg)

#### 새로운  config 파일 업로드
![새로운  config  업로드 2](https://user-images.githubusercontent.com/53853730/65474624-8697fd80-deb7-11e9-9e1a-920c2936c90b.jpg)

~~~
http://localhost:8983/solr/#/ 접속 후,
ADD collection  해서 name 쓰고, config set 설정해준다.
Dataimport 후, clean & commit 체크 후 
execute & refresh status 해준다.
~~~

---
### solr 색인
~~~
1. DB 생성
2. insert data (bulk 할 정도면 java code로 업로드 아니면 insert query로...)
3. schema.xml 생성(스키마 컬럼명 지정)
4. data-config.xml 생성(DB config와 필드 컬럼 설정)
5. upload & reload
~~~
-> http://lucene.apache.org/solr/guide/
