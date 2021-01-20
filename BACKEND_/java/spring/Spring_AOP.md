## Spring AOP

```java
[LogExecutionTime annotation]

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* 어디에 적용할지 표시 해두는 용도*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {

}

[LogAspect.java]

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component // 빈 등록
@Aspect
public class LogAspect {
	
	Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Around("@annotation(LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object proceed = joinPoint.proceed(); // 실행 (LogExecutionTime 붙인 메서드)
		
		stopWatch.stop();
		logger.info(stopWatch.prettyPrint());
		
		return proceed;
	}
}
//.. 프록시 패턴 기반
```

```log
//@LogExecutionTime이 붙어있는 controller log!!

INFO 14564 --- [nio-8080-exec-2] o.s.samples.a.b.LogAspect: StopWatch '': running time = 16268900 ns
---------------------------------------------
ns         %     Task name
---------------------------------------------
016268900  100%  
```