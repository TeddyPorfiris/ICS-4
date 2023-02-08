<script setup>
import { ref, onMounted } from 'vue'
import EventService from '@/services/EventService.js'
 
const event = ref(null)
const id = ref(123)
 
onMounted(() => {
  EventService.getEvent(id.value)
    .then((response) => {
      event.value = response.data
    })
    .catch((error) => {
      console.log(error)
    })
})
 
onMounted(() => {
  // fetch event (by id) and set local event data
})
</script>
 
<template>
  <div>
    <h1>{{ event.title }}</h1>
    <p>{{ event.time }} on {{ event.date }} @ {{ event.location }}</p>
    <p>{{ event.description }}</p>
  </div>
</template>
