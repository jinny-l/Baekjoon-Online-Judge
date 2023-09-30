import java.util.Collections;
import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] alphas = s.split("");
        Arrays.sort(alphas); 
        
        for(int i = alphas.length - 1; i >= 0; i--) {
            answer.append(alphas[i]);
        }
        
        return answer.toString();
    }
}