<template>
  <div class="map__form">
    <MapFormInputs/>
    <MapFormFloor/>
  </div>
</template>

<script>
import MapFormFloor from "@/components/map/MapFormFloor";
import MapFormInputs from "@/components/map/MapFormInputs";
export default {
  components: {MapFormInputs, MapFormFloor},
  setup(){
  }
}
</script>