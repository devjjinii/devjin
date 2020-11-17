## NVL 함수

* NVL 함수는 값이 null 인 경우 지정값을 출력.
  * NVL("값", "지정값")
* NVL(CODE, 0) // 코드가 null 이면 0

## NVL2 함수

* ( DECODE 함수 + NVL 함수 )
* NVL2 함수는 값이 null이 아닌경우 지정값1 을 출력하고, null 일 경우 지정값2 를 출력.
  * NVL2("값","지정값1","지정값2")
* NVL2(CODE, Y, N) // 코드가 null 이 아니면 Y , null 이면 N
