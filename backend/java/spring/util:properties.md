## <util:properties />

* resources 폴더 밑에서 진행

* opt/opt.xml  설정 (프로퍼티 .xml)
```xml
<?xml	version="1.0"	encoding="UTF-8"?>
<!DOCTYPE	properties	SYSTEM	"http://java.sun.com/dtd/properties.dtd">
<properties>
    <comment>OTP 변수	설정</comment>
    <entry	key="otp.userName">jin</entry>
    <entry	key="otp.hostName">dev</entry>
    <entry	key="otp.propertyKey">jin12345</entry>
</properties>
```


* applicationContext.xml (혹은, 각 프로젝트에 맞게 dispatcher-servlet.xml)
```xml
<!-- 2020.12.08 로그인시 사용하는 OTP 에서 사용하는 변수들 설정 config  -->
<util:properties	id="otpProperties" location="classpath:config/otp/otp.xml" />
```

* 클래스(.java) 에서 사용
  * "#{id['key']}"
```java
@Value("#{otpProperties['otp.userName']}")  // otp userName
private String userName;

@Value("#{otpProperties['otp.hostName']}")  // otp hostName
private String hostName;

@Value("#{otpProperties['otp.propertyKey']}")  // otp secretKey
private String propertyKey;

```
