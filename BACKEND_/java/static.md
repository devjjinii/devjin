## static

#### public static void main(String args[]) <br>

* static을 method에 선언해주면 정적 method가 되고, 변수에 선언해주면 정적 변수가 된다. 
* 정적으로 선언하게 되면 <<<객체를 생성해주지 않아도 프로그램 실행시에 자동으로 메모리에 적재된다.(JVM) >>>
* main mehtod 같은 경우는 객체를 생성하지 않아도 실행되어야 하기 때문에 static으로 선언하는 것이다.
* public 접근 제어자는 JVM이 main 함수가 어디에 위치하던 접근 가능해야 하기 때문에 사용한다.
* main mehtod 를 void 형으로 선언하는 이유는 main method 가 끝나면 프로그램이 종료되기 때문에 return 값의 의미가 없기 때문이다.
* 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 static를 붙인다.
(-> 인스턴스를 생성하면 서로 독립적이기 때문에 서로 다른값을 유지한다.)
* static이 붙은 멤버변수는 인스턴스(객체)를 생성하지 않아도 사용할 수 있다. (메모리에 올라 갈때 이미 자동적으로 생성)
* static이 붙은 메서드에서는 인스턴스 변수를 사용할 수 없다.
* 메서드 내에서 인스턴스 변수를 사용하지 않는다면 , static를 붙이는 것을 고려한다.

* 인스턴스변수와 관련된 작업을 하는 메서드에서는 static 이 안붙은 메서드이고,
static 변수와 관련된 작업을 하는 메서드는 static이 붙은 메서드라고 보면 된다.

```java
class card {
  String kind; //인스턴스 변수 
  int number; //인스턴스 변수
  
  static int width = 100; //클래스 변수 (공통적인 값)
  static int height = 200; //클래스 변수 (공통적인 값)
}
```
* 참고 : https://rockdrumy.tistory.com/214