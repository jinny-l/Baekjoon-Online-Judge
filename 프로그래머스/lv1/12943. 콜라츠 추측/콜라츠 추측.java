class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num == 1) {
            return 0;
        }
        
        Long number = Long.valueOf(num);
        
        while(number != 1) {
                        
            if(answer >= 500) {
                return -1;
            }
            
            if(number % 2 == 0) {
                number /= 2;
                answer++;
                
            } else {
                number = number * 3 + 1;
                answer++;
            }

        }
        
        return answer;
    }
}