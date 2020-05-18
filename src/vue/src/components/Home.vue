<template>
    <div id="app">
        <Layout>
            <template #header="self">
                <router-link to="/home"><h1 id="title">{{self.title}}</h1></router-link>
                <router-link to="/join"><span id="join">{{self.join}}</span></router-link>
                <router-link to="/login"><span id="login">{{self.login}}</span></router-link>

            </template>
            <template #sidebar>
                <ul class="menu">
                    <li v-for="i of sidebars" :key="i.menu">
                        <router-link :to="i.link">{{i.menu}}</router-link>
                        <!--<a @click="menu(i.menu)">{{i.menu}}</a>-->
                    </li>

                </ul>
            </template>
            <template #content>
                <div class="imgcontainer">
                    <img src="https://cmail.daum.net/v2/mails/0000000000001Uj/attachments/MjoxLjI6MTM1Njo2MDI2MDppbWFnZS9wbmc6YmFzZTY0OnNzODRvd1kxdGktbURmS19FY3pXYVE/raw/pp.png" alt="Avatar" class="avatar">
                </div>
                <router-view/>
            </template>
            <template #footer="self" >
                <h3 id="footer">{{self.footer}}</h3>
            </template>
        </Layout>
    </div>
</template>

<script>
    import Layout from "../components/common/Layout.vue"
    export default {
        components : {Layout},
        data(){
                return {
                    sidebars: [
                    {menu: '쓰기',link:'/register'},
                    {menu: '목록',link:'/list'},
                    {menu: '검색',link:'/search'},
                    {menu: '수정',link:'/update'},
                    {menu: '삭제',link:'/delete'},
                    {menu:'회원수',link:'/vuexCounter'}
                ]
            }
        },
        methods:{
            menu(i){
                switch (i) {
                    case '쓰기' : alert('0')
                                break;
                    case '목록' : alert('1')
                                break;
                    case '검색' : alert('2')
                                break;
                    case '수정' : alert('3')
                                break;
                    case '삭제' : alert('4')
                                break;
                    case '회원수' : alert('5')
                                break;

                }
            }
        }
    }
</script>
<style scoped>
    ul.menu{
        position: relative;
        padding: 5px;
        list-style: none;
        font-style: italic;
        background-color: #FFE1938F;
    }
    #title{width: 300px;margin: 0 auto}
    #login{margin-right: 50px; float: right}
    #join{margin-right: 50px; float: right}
    #footer{width: 300px; margin: 0 auto}
</style>