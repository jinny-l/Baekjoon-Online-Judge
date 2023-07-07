import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            int tmp = d[i];
            
            if(budget < tmp) {
                break;
            }
            
            budget -= tmp;
            answer++;
        }
        
        return answer;
    }
}