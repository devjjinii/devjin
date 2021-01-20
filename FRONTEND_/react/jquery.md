## jquery

* react 에서 jquery 사용

```javascript
const $ = window.$  

const target = e.currentTarget
if ($(target).hasClass('active')) {
          $(target).removeClass('active');
          $('.row .item').removeClass('schedule-on')
          $('.row .item').removeClass('schedule-off');
          $('.schedule-row').slideUp(200);
}
```