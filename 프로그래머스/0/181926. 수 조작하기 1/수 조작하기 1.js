function solution(n, control) {
    const numbers = [...control];
    
    for(let i = 0; i < numbers.length; i++) {
        if(numbers[i] === 'w') {
            n++;
        }
        
        if(numbers[i] === 's') {
            n--;
        }
        
        if(numbers[i] === 'd') {
            n += 10;
        }
        
        if(numbers[i] === 'a') {
            n -= 10;
        }
    }
    
    return n;
}