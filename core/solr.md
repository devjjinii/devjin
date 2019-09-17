#### SOLR 색인
~~~
1. DB 생성
2. insert data (bulk 할 정도면 java code로 업로드 아니면 insert query로...)
3. schema.xml 생성(스키마 컬럼명 지정)
4. data-config.xml 생성(DB config와 필드 컬럼 설정)
5. upload & reload
~~~
-> http://lucene.apache.org/solr/guide/