import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency)
                                  .boxed()
                                  .sorted(Comparator.reverseOrder())
                                  .collect(Collectors.toList());
        
        int[] answer = new int[emergency.length];
        
        int index = 0;
        for(int val : emergency) {
            answer[index++] = list.indexOf(val) + 1;
        }
        
        return answer;
    }
}