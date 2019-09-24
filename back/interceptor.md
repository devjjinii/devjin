### Interceptor <br>
<pre>
<code>
public class RequestInfoInterceptor extends HandlerInterceptorAdapter {
   
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   
   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (logger.isInfoEnabled()) {
           //log 찍을 내용
            ...
            Enumeration enums = request.getParameterNames();

            while (enums.hasMoreElements()) {
                String paramName = (String) enums.nextElement();
                String[] parameters = request.getParameterValues(paramName);

                if (ArrayUtils.isNotEmpty(parameters)) {
                    for (String parameter : parameters) {
                      // param 찍을 내용
                      ...
                    }
                }
            }
        }
        return true;
    }
}
</code>
</pre>
