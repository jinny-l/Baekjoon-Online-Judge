import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        // 작업 시간 계산
        for(int i = 0; i < progresses.length; i++) {
            int workingdays = (int) Math.ceil((100d - progresses[i]) / speeds[i]);
            queue.add(workingdays);
        }
        
        // 배포 가능 작업 확인
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()) {
            int workingdays = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= workingdays) {
                queue.poll();
                count++;
            }
            list.add(count);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}