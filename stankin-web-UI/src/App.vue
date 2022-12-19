<template>
  <Header />
  <router-view/>
  <FooterMenu/>
</template>
<script>
import Header from "@/components/Header";
import FooterMenu from "@/components/FooterMenu";
export default {
  components: {FooterMenu, Header},
  setup(){

  }
}
</script>