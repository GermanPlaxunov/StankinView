import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'StankinView',
    component: ()=>import('@/views/HomePage.vue')
  },
  {
    path: '/maps',
    name: 'Maps',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import('@/views/MapsPage.vue')
  },
  {
    path: '/teachers',
    name: 'Teachers',
    component: () => import('@/views/TeacherPage.vue')
  },
  {
    path: '/timetable',
    name: 'Timetable',
    component: () => import('@/views/TimetablePage.vue')
  }

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
