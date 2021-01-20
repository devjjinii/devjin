### ApplicationContext

~~~java
 @Resource
 private ApplicationContext applicationContext;
 
 // java.class 에서 java.
 final Object bean = applicationContext.getBean(beanName); 
 
 // java.class의 메소드 이름.
 final Method method = MethodUtils.getAccessibleMethod(bean.getClass(), methodName);

Executors.defaultThreadFactory().newThread(() -> {
      try {
          if ( StringUtils.isNotEmpty(params) ){
              MethodUtils.invokeMethod(bean, methodName, params);
          } else {
              MethodUtils.invokeMethod(bean, methodName);
          }
      } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
          logger.error(e.getMessage(), e);
      }
  }).start();
~~~
