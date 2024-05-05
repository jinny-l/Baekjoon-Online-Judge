import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] alphas = my_string.toLowerCase().split("");
        Arrays.sort(alphas);
        
        return String.join("", alphas);
    }
}