<template>
  <div>
   <div> <h1>카운터:{{count}}</h1></div>
    <button @click="increment">
       <h2>더하기</h2>
        <img src="https://w7.pngwing.com/pngs/927/174/png-transparent-new-super-mario-bros-wii-new-super-mario-bros-wii-super-paper-mario-mario-heroes-super-mario-bros-sonic-the-hedgehog-thumbnail.png" alt="Avatar" class="avatar">
    </button>
      <button @click="decrement">
       <h2>빼기</h2>
        <img src="https://upload.wikimedia.org/wikipedia/ko/d/d4/%EC%9A%94%EC%8B%9C.png" alt="Avatar" class="avatar">
    </button>
   <br>
      <button @click="clear">
          <img src="  https://lh3.googleusercontent.com/proxy/0qxozoBeb7UofKQR02VhI8d0Iy34ZAExJG849iq-4b98feClxB-V5btsC3KbRlnYCAT5Ju61K9lOtW1vWXoZn3hlHd8gF8Sf4jrE26usjOuUVsgqcd4VQ7PB5BIC-sdSvqMuiGBRITbn-XPDp2P6LbTw2MiHE_vCdLN0Z6Rjof6Jl-x9Y3oyf2EroxOgNm4g7b0Mu1MG_MAEcdde_2-ik9yCmf-T3l0lKwQGP3LROKngLQOwvAPcyA0mX3YZqHn6yVjwp0RjMtfKmkm8f-Rt9-DFrvyG9y8pUbI" alt="Avatar" class="avatar">
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