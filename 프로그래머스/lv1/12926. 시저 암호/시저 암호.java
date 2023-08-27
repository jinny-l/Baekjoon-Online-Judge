import java.util.*;

class Solution {
    public String solution(String s, int n) {
        char[] alphas = s.toCharArray();
        
        for(int i = 0; i < alphas.length; i++) {
            char tmp = alphas[i];
            
            if(tmp == ' ') {
                continue;
            }
            
            char newChar = (char) (alphas[i] + n);
            
            if(Character.isUpperCase(tmp) && newChar > 90) {
                newChar = (char) (newChar - 91 + 'A');
            } else if(Character.isLowerCase(tmp) && newChar > 122) {
                newChar = (char) (newChar - 123 + 'a');
            }
            alphas[i] = newChar;
        }
        
        return new String(alphas);
    }
}