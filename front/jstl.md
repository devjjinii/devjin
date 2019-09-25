### jstl

~~~
<c:foreach items="${리스트}" var="for문 변수" varStatus="상태용 변수">
  // 반복해서 표시할 내용 혹은 반복할 구문
</c:foreach>


상태용 변수를 status라고 지정한다.
<c:forEach var="vo" items="${dataMap.abc}" varStatus="status">
             ${status.count}.&nbsp;${vo.def}
             //1. 
             //2.
             //3. 
             //......
</c:forEach>
~~~
---
~~~
${status.current} 현재 for문의 해당하는 번호
${status.index} 0부터의 순서
${status.count} 1부터의 순서
${status.first} 첫 번째인지 여부
${status.last} 마지막인지 여부
${status.begin} for문의 시작 번호
${status.end} for문의 끝 번호
${status.step} for문의 증가값
~~~ 
