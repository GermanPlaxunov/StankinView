<template>
  <div class="home__card">
    <img :src="src" alt=""/>
    <div class="home__card-title">
      {{title}}
    </div>
  </div>
</template>

<script>
export default {
  props:['src','title'],
  setup() {

  }
};
</script>

<style lang="scss">

</style>