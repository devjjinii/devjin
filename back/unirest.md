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

### writeValueAsString (map -> string)
~~~
public class CommonUtil {

    public static String objPrint(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        String result = null;
        try {
            result = mapper.writeValueAsString(o);
        } catch (Exception e) {
            return null;
        }
        return result;
    }

}

{"a" : abcd, "b" : asbdf, "c" : gdfsf} //string ABC

String str = ABC;
String[] array = str.split(","); //분리된 문자열 앞뒤 공백 제거 -> "\\s*,\\s*"
~~~
