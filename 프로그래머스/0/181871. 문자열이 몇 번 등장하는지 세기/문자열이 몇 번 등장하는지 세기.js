function solution(myString, pat) {
    var answer = 0;
    
    for(let i = 0; i <= myString.length - pat.length; i++) {
        const substring = myString.substring(i, i + pat.length);
        
        if(substring.includes(pat)) {
            answer++;
        }
    }
    
    return answer;
}