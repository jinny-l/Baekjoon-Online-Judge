import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            
            if(stack.size() >= 1 && stack.peek() == tmp) {
                stack.pop();
            } else {
                stack.push(tmp);
            }
        }
        
        if(stack.isEmpty()) {
            return 1;
        }
        
        return 0;
    }
}