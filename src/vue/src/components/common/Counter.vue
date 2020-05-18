<template>
    <div>
       <h1>회원수 카운터</h1>
       <div class="calculator">
        <div>{{ count }}</div>
        <div @click="counter" class="btn operator">회원수 올리기</div>
        <div @click ="clear"  class="btn"> 회원수 지우기</div>
       </div>
    </div>
</template>

<script>
    export default {
        data () {
            return {
                count: 0
            }
        },
        methods: {

            clear(){
                this.count=0
            },
            counter(){
                this.count++
            }

        }
    }
</script>

<style scoped>
    .calculator {
        margin: 0 auto;
        width: 400px;
        font-size: 30px;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        grid-auto-rows: minmax(60px, auto);
    }
    .display {
        grid-column: 1 / 5;
        background-color: #333;
        color: white;
    }

    .btn {
        background-color: #F2F2F2;
        border: 1px solid #999;
    }
    .operator {
        background-color: orange;
        color: white;
    }
</style>