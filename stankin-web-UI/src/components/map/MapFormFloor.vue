<template>
  <div class="map__floor">
    <span>Floor</span>
    <paginate
        :v-model="page"
        :page-count="9"
        :page-range="1"
        :margin-pages="1"
        :click-handler="clickCallback"
        :prev-text="' '"
        :next-text="' '"
        prev-link-class="page-link prev-link"
        next-link-class="page-link next-link"
        :container-class="'pagination'"
        :page-class="'page-item'"
    >
    </paginate>
  </div>
</template>

<script>
import Paginate from 'vuejs-paginate-next';
import {ref} from "vue";
export default {
  components:{Paginate},
  setup(){
    const page = ref(1)
    const clickCallback = (pageNum) => {
      console.log(pageNum)
    }
    return {clickCallback, page}
  }

}
</script>


<style lang="css">
/* Adopt bootstrap pagination stylesheet. */
/*@import "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"*/
/*@import "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css";*/
/* Write your own CSS for pagination */
.pagination {
  display: flex;
  padding-left: 0;
  list-style: none;
}

/*element.style {*/
/*}*/
/*.page-item:last-child .page-link {*/
/*  !* border-top-right-radius: 0.25rem; *!*/
/*  !* border-bottom-right-radius: 0.25rem; *!*/
/*}*/
/*.page-item:not(:first-child) .page-link {*/
/*  !* margin-left: -1px; *!*/
/*}*/
/*<style>*/
 .page-item .page-link {
   width: 24px;
   height: 24px;
   border-radius: 4px;
   padding: 0;
   display: flex;
   align-items: center;
   justify-content: center;
   font-style: normal;
   font-weight: 400;
   font-size: 12px;
 }
.page-link {
  padding: 0.375rem 0.75rem;
}
.page-link {
  position: relative;
  display: block;
  color: #0d6efd;
  text-decoration: none;
  background-color: #fff;
  border: 1px solid #dee2e6;
  transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
}
.page-item.disabled .page-link {
  color: #6c757d;
  pointer-events: none;
  background-color: #fff;
  border-color: #dee2e6;
}
.page-item.active .page-link {
  z-index: 3;
  color: #fff;
  background-color: #0d6efd;
  border-color: #0d6efd;
}
.page-item {
  cursor: pointer;
  margin: 1px;
}
.page-item .page-link {
  width: 24px;
  height: 24px;
  border-radius: 4px;
  padding: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  font-style: normal;
  font-weight: 400;
  font-size: 12px;
}
.page-item .page-link:focus{
  box-shadow: none;
}
.page-item .next-link:before, .page-item .prev-link:before {
  content: "";
  width: 5px;
  height: 5px;
  border: 4px solid #2F80ED;
  border-radius: 2px;
  border-left-color: transparent;
  border-bottom-color: transparent;
  transform: rotate(45deg);
}

.page-item .prev-link:before{
  transform: rotate(-135deg);
}
</style>