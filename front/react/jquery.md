## jquery

~~~

html -> react 로 변경하고 있는데,

react에서는 퍼블에서 나온 jquery (html,jsp 전용)를 어떻게 사용할까 하다,
 
const $ = window.$ 이런식으로 선언해주고 나서, 

  const target = e.currentTarget
  if ($(target).hasClass('active')) {
            $(target).removeClass('active');
            $('.row .item').removeClass('schedule-on')
            $('.row .item').removeClass('schedule-off');
            $('.schedule-row').slideUp(200);
  }

이런식으로 사용하면 되겠다.

~~~
