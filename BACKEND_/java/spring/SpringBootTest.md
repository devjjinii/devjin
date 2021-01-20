## Spring Boot Test

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
  
  @Autowired
  ApplicationContext applicationContext;
  
  @Test
  public void test() {
      TestController bean = applicationContext.getBean(TestController.class);
      // null 이 아닐 경우 통과
      assertThat(bean).isNotNull();
  }
}  
```
