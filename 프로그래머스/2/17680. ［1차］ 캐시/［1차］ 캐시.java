import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        // 캐시 사이즈가 0일 때
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        // 캐시 사이즈가 1이상일 때
        List<String> cache = new LinkedList<>();
        int answer = 0;
        
        for(int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            
            // 캐시 hit일 경우, 캐시 순서 변경
            if(cache.contains(city)) {
                cache.remove(city);
                answer += 1;
                
            } else { // 캐시 miss일 경우, 제일 오래된 캐시 제거 후 새로운 데이터 추가
                if(cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                answer += 5;
            }
            cache.add(city);
        }        
        return answer;
    }
}