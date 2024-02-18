import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        
        int answer = 0;
        boolean found = false;
        while(!queue.isEmpty() && !found) {
            for(int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;
                    
                    if(i == location) {
                        found = true;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}