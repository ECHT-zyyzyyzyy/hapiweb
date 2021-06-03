import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'
import './assets/css/global.css'
import axios from 'axios'
// import VueAxios from 'vue-axios'

Vue.config.productionTip = false
Vue.prototype.$http = axios

// Vue.use(VueAxios, axios)

axios.defaults.baseURL = 'http://localhost:8888'

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
