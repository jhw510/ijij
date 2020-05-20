import axios from 'axios'
import header from "vuetify/lib/components/VDataTable/mixins/header";

const state = {
    context:'http://localhost:3000/',
    player:{},
    fail:false,
    auth:false
}
const actions = {
   async login({commit}) {
       const url =state.context + state.player.playerId +`/access`
       const headers ={
           'Content-Type':'application/json'
       }
        commit('login')
       axios.post(url, state.player, headers)
           .then(({data})=>{
               alert('자바를 다녀옴')
               commit('LOGIN_COMMIT', data)
           })
        .catch(()=>{
           alert('서버전송 실패')
            state.fail = true
        })
   },

    async join({commit}) {
        commit('join')
    }
}
const  mutations = {
    LOGIN_COMMIT(state,data){
        state.auth=true
        state.player=data.player
        localStorage.setItem('token',data.token)
        localStorage.setItem('playerId',data.player.playerId)
        if(data.player.auth === 'USER'){
            alert("일반사용자")
           /*일반사용자*/
        }else{
            alert("관리자")
            /*관리자*/
        }
    },
    join(){
        alert("회원가입")
    }


}
const getters = {

}
export  default {
    name : 'player',
    namespace : true,
    state,
    actions,
    mutations,
    getters,
    axios

}