import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> values = new ArrayList<>(map.values());
        values.sort((o1, o2) -> (o2 - o1));
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < values.size(); i++) {
            int tmp = values.get(i);
            
            if (tmp >= k) {
                count++;
                break;
            }
            
            count++;
            k -= tmp;
        }
        
        return count;
    }
}