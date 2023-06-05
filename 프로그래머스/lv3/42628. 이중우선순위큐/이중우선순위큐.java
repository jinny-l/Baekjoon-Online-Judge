import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        
        for (int i = 0; i < operations.length; i++) {
            String[] tmp = operations[i].split(" ");
            String operator = tmp[0];
            int number = Integer.parseInt(tmp[1]);
    
               if (operator.equals("I")) {
                maxQueue.add(number);
                minQueue.add(number);
                continue;
            }

            if (operator.equals("D")) {
                if (maxQueue.size() < 1) {
                    continue;
                }
                if (number == -1) {
                    maxQueue.remove(minQueue.poll());
                    continue;

                }
                if (number == 1) { 
                    minQueue.remove(maxQueue.poll());
                    continue;
                }
            }
        }
        
        if(maxQueue.size() < 1) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = maxQueue.peek();
            answer[1] = minQueue.peek();
        }
        
        return answer;
    }
}