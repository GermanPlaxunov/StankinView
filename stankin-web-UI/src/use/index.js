import App from '@/App.vue';
import {createApp} from "vue";
import router from '@/router';
import store from '@/store';
import Paginate from "vuejs-paginate-next";

const app = createApp(App);







app
  .use(store)
  .use(router)
  .use(Paginate)




export {app}
