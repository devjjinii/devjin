## 생성자
~~~
생성자를 만드는 이유 :  인스턴스 생성시 필드에 초기값으로 부여하기 위해
                     , 인스턴스 생성에 필요한 초기화 명령을 실행하기 위해
                     
* 인스턴스 : 인스턴스(instance)는 해당 클래스의 구조로 컴퓨터 저장공간(메모리)에서 할당된 실체를 의미         
 
생성자 작성 방법 : return 할 수 없다, 반드시 클래스명과 동일하게 작성한다, 오버로딩이 가능하다.(여러 개 선언 가능)

public class Member{
  private String name;
  private String age;
  
  //생성자
  public Member() {
    //TODO
  }
  
  public Member(string name) {
    this.name = name;
  }
  
}

생성자는 클래스에서 필수적인 관계이다.
모든 클래스는 생성자를 가지고 있으며, 기본 생성자는 만들지 않아도 생성이 된다.
필요하면 생성한다. 생성자가 많을 수록 편리하게 필드에 접근 할 수 있다.
~~~
