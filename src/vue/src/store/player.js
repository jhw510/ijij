import axios from 'axios'
import header from "vuetify/lib/components/VDataTable/mixins/header";

const state = {
    player:{},
    fail:false,
    auth:false
}
const actions = {
   async login({commit}) {
        commit('login')
    axios.post('',player,header)
        .then(({data})=>{
            state.auth=true
            commit('LOGIN_COMMIT',data)
        })
        .catch(()=>{
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