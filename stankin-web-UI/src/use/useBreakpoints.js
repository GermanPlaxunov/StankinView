import {useBreakpoints} from "@vueuse/core";
import {computed} from "vue";

export default function useGetSize() {
  const breakpoints = useBreakpoints({
      mobile: 0,
      notMobile: 610.9,
      full: 11999.9,
    }),
    mobile = breakpoints.between('mobile', 'notMobile'),
    notMobile = breakpoints.between('notMobile', 'full'),
    getSizeMobile = computed(() =>  mobile.value)
  return getSizeMobile.value
}