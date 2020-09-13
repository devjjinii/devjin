## 필드 인젝션보다 생성자 인젝션을 써야 하는 이유

* null 을 주입하지 않는 한 NullPointerException 은 발생하지 않는다.
* 의존관계 주입을 하지 않은 경우에는 Controller 객체를 생성할 수 없다.
  * 의존관계에 대한 내용을 외부로 노출시킴으로써 컴파일 타임에 오류를 잡아낼 수 있다.
* final 을 사용할 수 있다. 
  * final 로 선언된 변수는 반드시 선언과 함께 초기화가 되어야 하므로 setter 주입시에는 의존관계 주입을 받을 필드에 final 을 선언할 수 없다.
* final 의 장점은 Controller 내부에서 Service 객체를 바꿔치기 할 수 없다.
~~~
@RequiredArgsConstructor
public class MemberService {

//  @Autowired
    private final MemberRepository memberRepository;
    
    ..../////
~~~
---
~~~
@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

을

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

로 
~~~
