import java.util.*;

class Solution {
    public String solution(String my_string) {
        List<Character> check = List.of('a', 'e', 'i', 'o', 'u');
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if(!check.contains(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}