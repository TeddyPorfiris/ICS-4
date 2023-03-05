<template>
  <a 
    v-if="isExternal" 
    target="_blank"
    rel="noopener"
    class="external-link"
    :href="to"><slot/></a>
  <router-link v-else v-bind="$props" class="internal-link"><slot/></router-link>
</template>
  <script setup>
  import { RouterLink } from 'vue-router'
  import { computed } from 'vue'

  const props = defineProps({
    ...RouterLink.props
  })
  

  const isExternal = computed(()=>{
    return typeof to === 'string' && to.startsWith('http')
  })
  </script>

