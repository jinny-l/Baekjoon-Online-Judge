import java.util.*;

class Solution {
    public String solution(String s) {

        int index = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                index = 0;
                sb.append(" ");
                continue;
            }
            
            if(index % 2 == 0) {
                sb.append(Character.toUpperCase(c));
                index++;
            } else {
                sb.append(Character.toLowerCase(c));
                index++;
            }
        }
        
        return sb.toString();
    }
}