<template>
    <div>
      <h1>Greetings, {{username}}</h1>
      <button @click="logout">Logout</button>
      <router-link :to="{name: 'invoices'}">
        <button>Invoices</button>
      </router-link>
    </div>
  </template>
  <script setup>
  import { ref } from 'vue'

  const username = ref(window.user)
  const logout = ()=>{
    window.user = null
    this.$router.push({name: 'Home', query: {logout: null}})
  }

  </script>