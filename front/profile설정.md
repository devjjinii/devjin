#### Profile 설정
~~~
<java.class>
    @Autowired
    private ConfigurableWebApplicationContext ctx;
    
     String[] profiles = ctx.getEnvironment().getActiveProfiles();
     mav.addObject("activeProfile", profiles[0]);
     ....
     
<java.jsp>
  <c:set var="profile" scope="session" value="application" />
	<c:if test="${!empty activeProfile}">
		<c:set var="profile" scope="session" value="application-${activeProfile}" />
	</c:if>

	<fmt:bundle basename="${profile}">
		<fmt:message key="api.server.host" var="API_SERVER_HOST" />
		<fmt:message key="ext.server.host" var="EXT_SERVER_HOST" />
	</fmt:bundle>
    ...
~~~

#### hasOwnProPerty (객체가 특정 프로퍼티에 대한 소유 여부를 반환)
~~~
해당 객체 특정 프로퍼티에 존재하면 true, 그렇지 않으면 false
~~~

#### gulp
~~~
gulp 파일 있는곳에서 (cmd 창 : cd project/admin/...)
> task 실행 후 뷰 수정 !!

.gitignore 에 node_modules 추가 후 commit !!
~~~ 
