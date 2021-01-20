## 전역 컨트롤러 : @ControllerAdvice

~~~java
@ControllerAdvice   //..(assignableTypes = {ABCcontroller.class, DEFcontroller.class} 범위지정가능
public class BaseController {
    @ExceptionHandler
    @InitBinder
    @ModelAttribute
}
~~~
