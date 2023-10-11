import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int index = moves[i] - 1;
            
            for (int j = 0; j < board.length; j++) {
                int doll = board[j][index];
                
                if (doll != 0) {
                    
                    if(!basket.isEmpty() && basket.peek() == doll) {
                        answer++;
                        basket.pop();
                    } else {
                        basket.push(doll);
                    }
                    
                    board[j][index] = 0;
                    break;
                }
            }
        }
        
        return answer * 2;
    }
}