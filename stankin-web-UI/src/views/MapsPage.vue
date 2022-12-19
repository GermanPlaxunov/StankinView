<template>
  <div class="map__section section-main">
    <MapImage/>
    <MapForm/>
  </div>
</template>
<script>
import {ref} from "vue";
import MapImage from "@/components/map/MapImage";
import MapForm from "@/components/map/MapForm";

export default {
  components: {MapForm, MapImage},
  setup() {


  }
}
</script>