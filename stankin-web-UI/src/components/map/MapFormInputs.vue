<template>
  <div class="map__inputs">
    <v-input class-name="item" label="From" place="Enter name"/>
    <v-input class-name="item" label="To" place="Enter name"/>
  </div>
</template>

<script>
import VInput from "@/components/ui/vInput";
export default{
  components: {VInput},
  setup(){

  }
}
</script>