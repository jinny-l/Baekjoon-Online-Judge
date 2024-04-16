import java.util.*;

class Solution {
    public int solution(String binomial) {
        if(binomial.contains("+")) {
            String[] tmp = binomial.split("\\s*\\+\\s*");
            return Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1]);
        }
        
        if(binomial.contains("-")) {
            String[] tmp = binomial.split("\\s*\\-\\s*");
            return Integer.parseInt(tmp[0]) - Integer.parseInt(tmp[1]);
        }
       
        String[] tmp = binomial.split("\\s*\\*\\s*");
        return Integer.parseInt(tmp[0]) * Integer.parseInt(tmp[1]);
    }
        
}