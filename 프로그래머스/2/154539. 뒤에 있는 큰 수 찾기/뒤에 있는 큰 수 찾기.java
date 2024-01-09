import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = numbers.length - 1; i >= 0; i--) {
            int number = numbers[i];
            answer[i] = -1;
            
            while(!stack.isEmpty()) {
                int peek = stack.peek();
                
                if(peek > number) {
                    answer[i] = peek;
                    break;
                }
                stack.pop();
            }
            stack.add(number);
        }
        
        return answer;
    }
}