### Unirest 
~~~
@RequestMapping(value = "/search/abc", method = { RequestMethod.GET, RequestMethod.POST })
public ResponseEntity searchABC(@RequestBody Entity entity,
                                HttpServletRequest request,
		                          	HttpServletResponse response
		                          	) throws Exception {
  //객체 생성

                                               // -> url  부분 
HttpResponse<JsonNode> response = Unirest.get(String.format("%s%s", host, url)) // host & url : properties로 ok,
          .queryString("a", entity.getA())
          .queryString("b", entity.getB())
          .queryString("c", entity.getC())
          .asJson();

    if(response.getStatus() == 200) {
        JSONObject jsonObject = response.getBody().getObject();
       
        // 객체에 set
       
    }  
  return ResponseEnttiy.status(HttpStatus.OK);
}
~~~