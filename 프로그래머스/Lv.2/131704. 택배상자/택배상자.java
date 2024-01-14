import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        int orderIndex = 0;
        for(int i = 1; i <= order.length; i++) {     
            boolean flag = false;
            
            if(i == order[orderIndex]) {
                answer++;
                orderIndex++;
                flag = true;
            }
            
            while(!stack.isEmpty() && stack.peek() == order[orderIndex]) {
                stack.pop();
                answer++;
                orderIndex++;
                flag = true;
            }
            
            if(!flag) {
                stack.push(i);
            }
        }
    
        while(!stack.isEmpty() && stack.peek() == order[orderIndex]) {
            stack.pop();
            answer++;
            orderIndex++;
        }
        
        return answer;
    }
}