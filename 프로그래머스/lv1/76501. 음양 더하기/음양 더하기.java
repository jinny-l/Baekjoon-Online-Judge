class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < absolutes.length; i++) {
            int number = absolutes[i];
            
            if(signs[i]) {
                answer += number;
            } else {
                answer += number * (-1);
            }
        }
        
        return answer;
    }
}