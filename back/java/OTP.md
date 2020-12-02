## OTP

* 2FA (Two-factor Authentication)
* 구글 OTP > Google Authenticator 를 이용해서 개발중이다.
  * 무작정 기능만 구현하려니까 ..  개념 이해가 중요하다는 것을 여기서 또 느꼈다.
* 처음에는 단말기에서 바뀌는 OTP 번호가 서버와 어떻게 통신하는지 이해를 할 수 없었다. API도 마땅히 없고 ㅠ.ㅠ.. 그러나!!
  * OTP는 단말기와 서버가 통신하는게 아니다.
  * 미리 정의된 비밀키와 시간 정보(구글 30초)를 토대로 Hash 처리하여 비밀번호를 만들어낸다.
    * 같은 알고리즘으로 단말기에서 비밀번호를 생성하고, 서버에서 체크한다.
    * 같은 시간대에 만들어졌으므로 단말기와 서버에서 만든 OTP번호는 동일하다.

* (QR 코드 url과 생성되는 secretKey는 고정으로 생각하고 바뀌는 OTP번호에 집중해야 한다.)
* 생성된 QR (구글 제공) URL 로 바코드 스캔을 하면 OTP번호가 떨어지는데 , 이 번호를 (secretKey 포함) 체크하면 된다.
  * (사용자가 입력한 번호와 secretKey가 같은지 비교. >> 로직으로.. )
* 이해하는데 시간이 좀 걸렸다.
  * Repo를 하나 파서 코드를 정리해야겠다. (기록 중요....)
---
* 참고  
  * https://enterkey.tistory.com/221  
  * https://zero-gravity.tistory.com/221  
  * https://lasdri.tistory.com/793  
  * https://hune.tistory.com/23 
