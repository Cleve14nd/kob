<!-- 公共区域，页面中心存放内容 -->
<template>
<div class="container content-field">
    <div class="card">
      <div class="card-body">
        <slot>
            <!-- 未来填充内容放入slot标签中 -->
        </slot>
      </div>
    </div>
  </div>
</template>
<script>

</script>
<style scoped>
div.content-field{
    margin-top:20px;
}

</style>