<template>
  <div class="footer__menu">
    <router-link to="/" class="footer__menu-item" active-class="active">
      <span class="material-icons">home</span>
      <span>Home</span>
    </router-link>
    <router-link to="/maps" class="footer__menu-item" active-class="active">
      <span class="material-icons">map</span>
      <span>Maps</span>
    </router-link>
    <router-link to="/teachers"  class="footer__menu-item" active-class="active">
      <span class="material-icons">people</span>
      <span>Teachers</span>
    </router-link>
    <router-link to="/timetable" class="footer__menu-item" active-class="active">
      <span class="material-icons">backup_table</span>
      <span>Timetable</span>
    </router-link>
  </div>
</template>

<script>
export default {
  setup(){

  }
}
</script>