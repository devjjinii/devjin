## SpringBoot(1)
~~~
서버로 띄우지 않고 main 함수 실행하듯 실행후 바로 종료 설정

public static void main(String[] args) {
  SpringApplication app = new SpringApplication(ABCDEF.class);
  app.setWebApplicationType(WebApplicationType.NONE);
  app.run(args);
}
~~~
