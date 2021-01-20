## Profile 설정

~~~java
  @Autowired
  private ConfigurableWebApplicationContext ctx;
  
    String[] profiles = ctx.getEnvironment().getActiveProfiles();
    mav.addObject("activeProfile", profiles[0]);
    ....
~~~

~~~jsp     
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
