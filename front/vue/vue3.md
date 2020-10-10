## vue 와 vue3 의 다른점

* router 설정이 다름.
  * https://www.vuemastery.com/blog/vue-router-a-tutorial-for-vue-3/

  ~~~js
  //routes/index.js
  ================== vue
  import Vue from 'vue'
  import VueRouter from 'vue-router';

  Vue.use(VueRouter);

  export default new VueRouter({
    routes: [
      {

      },
    ]
  })

  ================== vue3
  import { createWebHistory, createRouter } from 'vue-router';

  const router = createRouter({
    history: createWebHistory(),
    routes,
  });

  export default router;

   //mains.js
  import router from './routes/index';

  createApp(App)
    .use(router)
    .mount('#app');
  ~~~