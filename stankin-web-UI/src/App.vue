<template>
  <template v-if="useGetSize()">
    <Header />
    <router-view/>
    <FooterMenu/>
  </template>
  <Desktop v-else/>
</template>
<script>
import Header from "@/components/Header";
import FooterMenu from "@/components/FooterMenu";
import useGetSize from '@/use/useBreakpoints'
import Desktop from "@/components/Desktop";
export default {
  components: {Desktop, FooterMenu, Header},
  setup() {
    // await useGetSize();
    return {
      useGetSize
    }
  }
}
</script>