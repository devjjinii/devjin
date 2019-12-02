## Spring Boot Test

~~~
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
  
  @Autowired
  ApplicationContext applicationContext;
  
  @Test
  public void test() {
      TestController bean = applicationContext.getBean(TestController.class);
      assertThat(bean).isNotNull(); // ** 널이 아닐 경우 통과
  }

}  
~~~
