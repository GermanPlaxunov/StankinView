<template>
  <div class="form__search" :class="className">
    <input class="search__input" :class="{'error':error}" @change="$emit('onChange')" :type="type ? type :'text'" :value="modelValue" @input="$emit('update:modelValue', $event.target.value)" :placeholder="place" :disabled="disabled">
    <span class="material-icons search__icon">search</span>
    <slot></slot>
  </div>
</template>
<script>
export default {
  props:['className', 'label','place', 'error', 'type', 'disabled','modelValue']
}
</script>