import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            String value = clothes[i][0];
            
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for(Integer value : map.values()) {
            answer *= value + 1;
        }
        
        return answer - 1;
    }
}