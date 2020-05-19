<template>
  <div>
   <div> <h1>카운터:{{count}}</h1></div>
    <button @click="increment">
       <h2>더하기</h2>
        <img src="http://www.mariowiki.com/images/thumb/4/4c/Raccoon_Mario_-_New_Super_Mario_Bros_2.png/220px-Raccoon_Mario_-_New_Super_Mario_Bros_2.png" alt="Avatar" class="avatar">
    </button>
      <button @click="decrement">
       <h2>빼기</h2>
        <img src="https://upload.wikimedia.org/wikipedia/ko/d/d4/%EC%9A%94%EC%8B%9C.png" alt="Avatar" class="avatar">
    </button>

      <button @click="clear">
          <img src="https://vignette4.wikia.nocookie.net/mario/images/0/0c/MegaMushroomUTSM.png" alt="Avatar" class="avatar">
         <h2>지우기</h2>
      </button>
      <br>
      <button @click="incrementIfOdd">increment If Odd</button>
      <br>
      <button @click="incrementAsync">increment Async</button>
      <div>
          <div><h2>최근 5개 값의 로그 :{{recentHistory}}</h2></div>
      </div>
  </div>
</template>

<script>
    import {mapGetters,mapActions} from 'vuex'
    export default {
      computed:mapGetters([
          'count',
          'recentHistory'
      ]),
        methods:mapActions([
            'increment',
            'decrement',
            'clear',
            'incrementIfOdd',
            'incrementAsync'
        ])
    }
</script>

<style scoped>

</style>