import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        
        while(queue.peek() < K) {
            
            if(queue.peek() == 0 || queue.size() == 1) {
                return -1;
            }
            
            Integer a = queue.poll();
            Integer b = queue.poll();
            queue.add(a + (b * 2));
            answer++;
        } 
        
        return answer;
    }
}