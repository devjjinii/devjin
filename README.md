####  ZUUL PROXY (Spring Boot)<br>
##### zuul : 모든 마이크로서비스에 대한 요청을 먼저 받아들이고 라우팅하는 프록시 API Gateway 기능을 수행 <br>
zuul.routes.api.path = /abcd/** <br>
zuul.routes.api.url = http://localhost:port <br>
-> "/abcd" 경로로 유입되는 것은 http://localhost:port 로 연결한다. (url 패턴에 따라 자동으로 API server로 전달)
<pre>
<code>
import org.springframework.cloud.netflix.zuul.EnableZuulProxy; <br>

@SpringBootApplication
@EnableZuulProxy
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@SpringBootApplication이 명시된 애플리케이션 시작점 역할을 수행하는 클래스 레벨에 <br>
추가로 @EnableZuulProxy를 명시해주면 애플리케이션이 Netflix Zuul이 내장된 API Gateway이자 Reverse Proxy로 변신한다.
</code>
</pre>

#### NEXUS <br>
-> maven (pom.xml)
~~~
    <repositories>
		<repository>
			<id>internal-repo</id>
			<name>internal-nexus</name>
			<url>http://주소:port/nexus/content/groups/public/</url>
		</repository>
    </repositories>
~~~
