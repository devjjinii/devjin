## @JsonIgnore

* 해당 필드를 포함시키지 않고 싶을 때 선언하는 어노테이션

```java
@Column(name = "username", length = 50, unique = true)
private String username;

@JsonIgnore
@Column(name = "password", length = 100)
private String password;
```

```json
{
  "username" : "jin"
}
```
