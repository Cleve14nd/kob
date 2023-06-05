import { createRouter, createWebHistory } from 'vue-router'

//import PkIndexView from '../views/pk/PkIndexView'
import PkIndexView2 from '../views/pk/PkIndexView2'
import RecordIndexView from '../views/record/RecordIndexView'
import RanklistIndexView from '../views/ranklist/RanklistIndexView'
import UserBotIndexView from '../views/user/bot/UserBotIndexView'
import NotFound from '../views/error/NotFound'
//此处使用import导入view中界面

const routes = [
  {
    path:"/",
    name:"home",
    redirect:"/pk/"
  },
  {
    path:"/pk/",
    //localhost:8080/pk/
    name:"pk_index",
    component:PkIndexView2
    //对应的网页vue界面
  },
  {
    path:"/record/",
    name:"record_index",
    component:RecordIndexView
  },
  {
    path:"/ranklist/",
    name:"ranklist_index",
    component:RanklistIndexView
  },
  {
    path:"/user/bot/",
    name:"user_bot_index",
    component:UserBotIndexView
  },
  {
    path:"/404/",
    name:"404",
    component:NotFound
  },
  {
    path:"/:catchAll(.*)",
    
    redirect:"/404/"
  },
  // 从上往下执行，对于其他网页，重定向到404
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
