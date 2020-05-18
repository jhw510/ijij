export  const  increment = state =>{
    state.count ++
 state.history.push('increment')

}
export  const decrement = state =>{
    state.count--
    state.history.push('decrement')

}

export  const clear = state =>{
    state.count =0
    state.history.push('clear')
}
