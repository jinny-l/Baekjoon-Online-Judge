function solution(my_string, s, e) {
    const reverse = [...my_string].slice(s, e + 1).reverse();
    
    return [
        ...my_string.slice(0, s), 
        ...reverse, 
        ...my_string.slice(e + 1, my_string.length)
    ].join('');
}