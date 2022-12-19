<template>
  <div class="teacher__list">
    <TeacherItem v-for="i of 6"/>
  </div>
</template>
<script>
import TeacherItem from "@/components/teacher/TeacherItem";
export default {
  components: {TeacherItem}
}
</script>