### 06. 고급 검색

* 한글 형태소 분석기 사용하기
* 검색 결과 하이라이트하기
* 스크립팅을 이용해 동적으로 필드 추가하기
* 검색 템플릿을 이용한 동적 쿼리 제공
* 별칭을 이용해 항상 최신 인덱스 유지하기
* 스냅숏을 이용한 백업과 복구

##### 한글 형태소 분석기 사용하기
~~~
은전한닢 형태소 분석기
** Nori 형태소 분석기(사용)
  ->세종 말뭉치, mecab-ko-dic 사전
~~~

##### 검색 결과 하이라이트하기
![1014_1](https://user-images.githubusercontent.com/53853730/66731017-051d0500-ee90-11e9-9c98-405ead621cd2.JPG) <br>
![1014_2](https://user-images.githubusercontent.com/53853730/66731016-051d0500-ee90-11e9-8099-4dc20870e3a3.JPG) <br>

##### 스크립팅을 이용해 동적으로 필드 추가하기
~~~
스크립팅 : 스크립트를 이용해 사용자가 특정 로직을 삽입하는 것이 가능하다.
~~~

##### Template, Alias, Index
~~~
1. 템플릿을 생성한다.
2. 인덱스 별명을 생성한다.
POST _aliases
{
  "actions" : [
    {"remove" : {
      "index" : "bot-12345-*",
      "alias" : "bot-12345"}
    },
    {"add" : {
      "index" : "bot-12345-a",
      "alias" : "bot-12345" 
      }
    }
  ]
}
--> 인덱스의 별칭을 이용하면 두 개 이상의 인덱스를 검색해야 할 때 한 번의 요청만으로 모두 검색되도록 만들기 쉽다.
--> 색인을 삭제하고 다시 만드는 경우가 많아 별칭을 거의 필수적으로 사용한다.

3. 데이터를 입력한다.
4. 데이터를 조회(확인)한다.
~~~

##### 스냅숏을 이용한 백업과 복구
~~~
1. 스냅숏이 저장될 물리적인 디렉터리를 생성한다.
2. config 폴더의 elasticsearch.yml 파일에 생성한 경로를 지정해준다.
3. 재시작한다.
4. 재시작 후 _backup 레파지토리를 생성한다.
 --제공되는 옵션 : location, compress, chunk_size, max_restore_bytes_per_sec, max_snapshot_bytes_per_sec
      ,readonly
5. 더 이상 변경이 없는 인덱스로 스냅숏 대상으로 삼는다.
* 복구) _restore
~~~