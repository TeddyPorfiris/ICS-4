<template>
  <div id="nav">
    <AppLink id="logo" to="/">Vue School Travel App</AppLink>
    <AppLink
        v-for="destination in destinations"
        :key="destination.id"
        :to="{name: 'destination.show', params:{id: destination.id, slug: destination.slug}}"
      >
        {{ destination.name }}
      </AppLink>
      <AppLink :to="{name: 'protected'}">Dashboard</AppLink>
      <a target='_blank' href="https://vueschool.io">Vue School</a>
  </div>
</template>
  <script setup>
  import sourceData from '@/data.json'
  import { ref } from 'vue'
  // import AppLink from '@/components/AppLink.vue'


  const destinations = ref(sourceData.destinations)

  </script>