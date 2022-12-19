<template>
  <div class="map__content">
    <div class="map__image" :class="'scale'+scale" >
      <img src="@/assets/images/map1.jpg" alt="">
      <canvas id="map"></canvas>
    </div>
    <div class="scale">
      <div class="scale__item"  @click="scale = scale+50">+</div>
      <div class="scale__item" @click="scale = scale-50">-</div>
    </div>
  </div>
</template>

<script>
import {ref, watch} from "vue";

export default {
  setup() {
    let scale = ref(50);
    watch(scale,(a)=>{
      scale.value > 100 ? scale.value = 100 : null;
      scale.value < 0 ? scale.value = 0 : null;
      console.log(a)
    })
    return {
      scale
    }
  }
}
</script>