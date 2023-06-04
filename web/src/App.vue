<template>
  <div>
    botnick1:{{ bot_nick1 }}
  </div>
  <div>
    botnick2:{{ bot_nick2 }}
  </div>
  <router-view/>
</template>

<script>

import {ref} from 'vue';
import $ from 'jquery'

export default{
  name:"App",
  setup:()=>{
    let bot_nick1=ref("");
    let bot_nick2=ref("");

  $.ajax({
    url:"http://localhost:3000/pk/getbotinfo/",
    type:"get",
    success:resp=>{
      bot_nick1.value=resp.name1;
      bot_nick2.value=resp.name2;
      console.log(resp);

    }
  })
    return{
      bot_nick1,
      bot_nick2
    }
  }
}


</script>
<style>
body{
  background-image: url("@/assets/background.png");
  background-size: cover;
}
</style>
