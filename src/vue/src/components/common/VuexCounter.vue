<template>
  <div>
   <div> 카운터:{{count}}</div>
    <button @click="increment">+</button>
   <br>
    <button @click="decrement">-</button>
   <br>
      <button @click="clear">지우기</button>
  </div>
</template>

<script>
    import {mapGetters,mapActions} from 'vuex'
    export default {
      computed:mapGetters([
          'count'
      ]),
        methods:mapActions([
            'increment',
            'decrement',
            'clear'
        ])
    }
</script>

<style scoped>

</style>