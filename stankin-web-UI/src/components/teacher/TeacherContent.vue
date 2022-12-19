<template>
  <div class="teacher__content">
    <search-input class-name="teacher__search" place="Search"/>
    <TeacherList/>
  </div>
</template>
<script>
import SearchInput from "@/components/teacher/searchInput";
import TeacherList from "@/components/teacher/TeacherList";
export default {
  components: {TeacherList, SearchInput}
}
</script>