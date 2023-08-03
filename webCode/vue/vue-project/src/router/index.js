import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/emp',
    name: 'emp',
    component: () => import( '../views/tlias/EmpView.vue'),
  },
  {
    path: '/dept',
    name: 'dept',
    component: () => import( '../views/tlias/DeptView.vue')
  },
  {
    path: '/',
    name: 'emp',
    component: () => import( '../views/tlias/EmpView.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
