import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        
        while (queue.peek() < K) {
            
            if (queue.peek() == 0) {
                return -1;
            }
            
            if (queue.size() <= 1) {
                return -1;
            } 
            
            int tmp = queue.poll() + queue.poll() * 2;
            queue.add(tmp);
            answer++;
        }
        
        return answer;
    }
}