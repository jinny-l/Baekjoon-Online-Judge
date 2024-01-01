import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int cnt = 0;
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            
            if(stack.size() >= 4) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);
                int c = stack.get(stack.size() - 3);
                int d = stack.get(stack.size() - 4);
                
                if(a == 1 && b == 3 && c == 2 && d == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}