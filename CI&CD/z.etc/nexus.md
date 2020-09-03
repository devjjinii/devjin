## Nexus

라이브러리 에러나서 확인결과 nexus가 설정되어 있었다. <br>   
까먹기 전에 정리해본다. 
~~~
>>> pom.xml 

<repositories>
	<repository>
		<id>internal-repo</id>
		<name>internal-nexus</name>
		<url>http://abcd.df.cddd:9200/nexus/content/groups/public/</url>
	</repository>
</repositories>


* 공부할 때 블로그 참고 : https://laily.tistory.com/18 , http://bcho.tistory.com/790 <br>
~~~

