## swiper

* 퍼블 나온 swiper를 사용할때는, destory를 해줘야 한다.
* update 도 있어서 뻘짓 엄청 했다.  --> 초기화를 해주고 사용해야 한다.

* slideTo(index) 
~~~

liveTVSchedule : {
    swiper : null,
    initSwiper : function initSwiper(target) {
      //console.log('liveTVSchedule slideTo', target)
      uiWrapper.liveTVSchedule.swiper = new Swiper($('.schedule-box.livetv .swiper-container')[0], {
        // Default parameters
        slidesPerView: 3,
        slidesPerGroup: 3,
        spaceBetween: 0,
        navigation: {
            nextEl: $('.schedule-box.livetv .schedule-button-next')[0],
            prevEl: $('.schedule-box.livetv .schedule-button-prev')[0],
        },
        breakpoints: {
            1501: {
                slidesPerView: 4,
                slidesPerGroup: 4,
            },
        },
    })
      liveTVSchedule.swiper.slideTo(target)  // target 받아서 원하는 곳으로 이동

    }
  },
  
===============================================================================================

let target = 0
abc.forEach((each, idx) => {
    if (each.onair_yn === 'Y') {
        target = idx  // 주고 싶은곳에 target 설정
    }
})

if(liveTVSchedule.swiper) {
    liveTVSchedule.swiper.destroy(true,true)
}   
if(abc != null) {
    liveTVSchedule.initSwiper(target) // target 보낸 후 
}
  
~~~
