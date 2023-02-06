const app = Vue.createApp({
   data() {
      return {
         cart: [],
         premium: true
      }
   },
   methods: {
      addToCart(id){
         this.cart.push(id)
      },
      removeCart(id){
         let idIndex = this.cart.indexOf(id);
         this.cart.splice(idIndex, 1)
      }
   }
})