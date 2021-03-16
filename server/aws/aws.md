## AWS

* 클라우드 서비스 : 물리적 자원 혹은 논리적 자원을 대여하는 것
  * 직접 구축하는 것에 비해 장점 : 장비가 필요 없음(서버 장비 주문할 필요 없음), 관리필요 없음, 고장시 수리할 필요 없음
* https://aws.amazon.com/ko/
* AWS 프리 티어, 751 시간 초과되면 비용 부과됨. (서버꺼두기.)

* EC2 : Elastic Compute Cloud
  * os 선택 가능, 내 위치에서 가까운곳에서 자원생성,(터미널),
  * Amazon Linux (프리티어 사용가능)
  * 키 페어 : 새 키 페어 생성, 키 페어 이름 정하고 > 키 페어 다운로드 ( 복구및다운로드할수 없음, 안전한 곳에 보관) 
  * 인스턴스 생성 완료
  
 * IPv4 퍼블릭 IP 복사 > 터미널에서 > 키페어 파일 옮기고 ssh -i 키페어파일이름 유저이름(ec2-user)@Ipv4 퍼블릭 IP > enter
 
 * ssh 접속
 * 노드 설치
 * 포트 열어주기 : 네트워킹 > 보안그룹 변경 > 인바운드 > 규칙추가 3000 
 