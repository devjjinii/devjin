## writeValueAsString (map -> string)

```java
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
```