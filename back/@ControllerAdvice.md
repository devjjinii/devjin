## 전역 컨트롤러 : @ControllerAdvice

~~~
@ControllerAdvice   //..(assignableTypes = {ABCcontroller.class, DEFcontroller.class} 범위지정가능
public class BaseController {
    @ExceptionHandler
    @InitBinder
    @ModelAttribute
}
~~~
