import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ", -1);
        System.out.println(Arrays.toString(words));
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() == 0) {
                sb.append(" ");
                continue;
            }
            
            String first = String.valueOf(word.charAt(0)).toUpperCase();
            String left = word.substring(1, word.length()).toLowerCase();
            
            sb.append(first).append(left);
            
            if (i == words.length - 1) {
                break;
            }
            
            sb.append(" ");
        }
        
        if (s.substring(s.length() - 1).equals(" ")) {
            return sb.deleteCharAt(sb.length() - 1).toString();
        }
        
        return sb.toString();
    }
}