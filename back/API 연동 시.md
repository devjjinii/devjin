#### API 연동 시 HTTP 프로토콜
~~~
GET 방식은 URL에 매개변수를 포함해서 데이터를 전송하고, POST방식은 Request 메시지를 바디에 포함하여 전송한다.

<<POST>>

  @Override
  public HttpRequestBase configRequest() throws URISyntaxException, UnsupportedEncodingException {
                                                      // ->abcHost : http://......
      URIBuilder builder = new URIBuilder(String.format("%s%s", abcHost, abcUri));
      //NameValuePair 인터페이스는 POST방식에서 사용
      List<NameValuePair> params = Lists.newArrayList();
                                         // Name, Value
      params.add(new BasicNameValuePair("keywords", abcVo.getKeywords())); //string
      params.add(new BasicNameValuePair("count", String.valueOf(abcVo.getCount()))); //int

      HttpPost httpPost = new HttpPost(builder.build());
      httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
      return httpPost;
  }

<<GET>>

  @Override
  public HttpRequestBase configRequest() throws URISyntaxException, UnsupportedEncodingException {
      URIBuilder builder = new URIBuilder(String.format("%s%s", abcHost, abcUri));
      //URIBuilder 클래스는 GET 방식에 사용
      builder.addParameter("keywords", abcVo.getKeywords());
      builder.addParameter("count", String.valueOf(abcVo.getCount()));

      HttpGet httpGet = new HttpGet(builder.build());
      setHeaders(httpGet);
      return httpGet;
  }

~~~
