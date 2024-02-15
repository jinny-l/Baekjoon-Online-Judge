import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        
        for(int i = 0; i < s.length(); i++) {
            // 한칸씩 회전
            String str = s.substring(i, s.length()) + s.substring(0, i);
            char[] arr = str.toCharArray();
        
            // 옳은 괄호인지 확인
           if(isCorrect(arr)) {
                answer++;
           }
        }
        
        return answer;
    }
    
    private boolean isCorrect(char[] arr) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            
            if(!stack.isEmpty()) {
                
                if(stack.peek() == '[' && arr[i] == ']'
                  || stack.peek() == '(' && arr[i] == ')'
                  || stack.peek() == '{' && arr[i] == '}') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(arr[i]);
        }
        
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}