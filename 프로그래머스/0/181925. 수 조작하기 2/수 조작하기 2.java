class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++) {
            int num = numLog[i] - numLog[i - 1];
            
            if(num == 1) {
                answer.append("w");
            }
            
            if(num == -1) {
                answer.append("s");
            }
            
            if(num == 10) {
                answer.append("d");
            }
            
            if(num == -10) {
                answer.append("a");
            }
        }
        
        return answer.toString();
    }
}