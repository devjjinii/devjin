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
