class Solution {
    public int solution(int storey) {
        int answer = 0;
    
        while(storey != 0) {
            int number = storey % 10;
            storey /= 10;
            
            if(number > 5) {
                answer += (10 - number);
                storey++;
                
            } else if(number < 5) {
                answer += number;
                
            } else {
                if(storey % 10 >= 5) {
                    answer += (10 - number);
                    storey++;
                    
                } else {
                    answer += number;
                } 
            }
        }

        return answer;
    }
}