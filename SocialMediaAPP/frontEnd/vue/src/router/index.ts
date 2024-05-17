import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'login',
      component: () => import ('../views/LoginView.vue')
    },
    {
      path: '/home',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/signup',
      name: 'signup',
      component: () => import ('../views/SignupView.vue')
    },
    {
      path: '/post',
      name: 'post',
      component: () => import ('../views/PostView.vue')
    },
    {
      path: '/comment',
      name: 'comment',
      component: () => import ('../views/CommentView.vue')
    },
  ]
})

export default router
