import java.util.*;

class Solution {
    
    private Map<String, Integer> map = new TreeMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        // 주문을 알파벳 순으로 정렬
        for(int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        // 코스 길이 만큼 조합 만들기
        List<String> list = new ArrayList<>();
        
        for(int courseLength : course) {
            for(String order : orders) {
                combination("", order, courseLength);
            }
            
            // 결과 저장
            if(!map.isEmpty()) {
                List<Integer> counts = new ArrayList<>(map.values());
                int max = Collections.max(counts);

                if(max > 1) {
                    for(String key : map.keySet()) {
                        if(map.get(key) == max) {
                            list.add(key);
                        }
                    }
                }
            }
            map.clear();
        }
        
        // 결과 정렬
        Collections.sort(list);
        return list.toArray(new String[0]);
    }
    
    private void combination(String order, String others, int length) {
        if(length == 0) {
            map.put(order, map.getOrDefault(order, 0) + 1);
            return;
        }
        
        for(int i = 0; i < others.length(); i++) {
            combination(order + others.charAt(i), 
                        others.substring(i + 1),
                        length - 1
                       );
        }
    }
}