<!-- 
    导航栏组件，样式在bootstrap网站中查找复制过来
 -->

<template>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    
    <div class="container">
    <router-link class="navbar-brand" :to="{name:'home'}">知识竞赛平台</router-link>
    <!-- 前后端分离时 使用router-link标签直接定向到name -->
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <router-link v-bind:class="route_name == 'pk_index'?'nav-link active':'nav-link' " :to="{name:'pk_index'}">对战</router-link>
          <!-- 在class前面加: class内可以使用运算符 -->
        </li>
        <li class="nav-item">
            <router-link :class="route_name == 'record_index'?'nav-link active':'nav-link' " :to="{name:'record_index'}">对局列表</router-link>
        </li>
        <li class="nav-item">
            <router-link :class="route_name == 'ranklist_index'?'nav-link active':'nav-link' " :to="{name:'ranklist_index'}">排行榜</router-link>
        </li>
      </ul>
      <ul class="navbar-nav ">
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            下拉菜单
          </a>
          <ul class="dropdown-menu">
            <li>
                <router-link class="dropdown-item" :to="{name:'user_bot_index'}">我的信息</router-link>
                </li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">退出</a></li>
          </ul>
        </li>
        
      </ul>
    </div>
  </div>
</nav>
</template>

<script>
import {useRoute} from 'vue-router'

import {computed} from 'vue'
//实时计算

export default{
    setup() {
        const route =useRoute();
        let route_name =computed(()=> route.name);
        return{
            route_name
            //返回name实现导航栏选中对应高亮
        }

    }

}
</script>

<style>

</style>