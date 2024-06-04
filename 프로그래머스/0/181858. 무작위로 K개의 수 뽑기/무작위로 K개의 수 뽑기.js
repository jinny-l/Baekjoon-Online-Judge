function solution(arr, k) {
    var answer = Array.from(new Set([...arr])).slice(0, k);
    
    if(answer.length < k) {
        return answer.concat(new Array(k - answer.length).fill(-1));
    }
    
    return answer;
}