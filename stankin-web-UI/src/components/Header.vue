<template>
  <div class="header">
    <span v-if="my_route.name === 'News'" @click="$router.back()" class="material-icons cursor-pointer">chevron_left</span>
    <div class="header__title">
      {{my_route.name}}
    </div>
    <span class="material-icons cursor-pointer">menu</span>
  </div>
</template>

<script>
import {useRoute} from "vue-router/dist/vue-router";
import {computed, ref} from "vue";

export default {
  props:['back'],
  setup(props) {
    const route = useRoute()
    const my_route = computed(()=>route)
    return{my_route}
  }
};
</script>