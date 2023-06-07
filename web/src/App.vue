<template>
  <NavBar></NavBar>
  <!-- 在此处添加导航栏 -->
  
  <router-view/>
  <!-- 使用router改变对应网页地址，在router/index.js中配置 -->
</template>

<script>

import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// 导入NavBar组件、css、js
//import $ from 'jquery'

export default{
  components:{
    NavBar
  },
  setup(){
    
    
      
    // });
    // $.ajax({
    //   url:"http://127.0.0.1:3000/user/account/register/",
    //   type:"post",
    //   data:{
    //     username:"zhangsan",
    //     password:"pwzhangsan",
    //     confirmedPassword:"pwzhangsan",
    //   },
    //   success(resp){
    //     console.log(resp);
    //     console.log("111111");
    //   },
    //   error(resp){
    //     console.log(resp);
    //     console.log("222222");
    //   },
      
    // });
   }
  
}


</script>
<style >
body{
  background-image: url('./assets/images/background.png');
  
  background-size: cover;
}
</style>
