import java.util.*;

class Solution {
    public int[] solution(String s) {
        String string = s.replaceAll("[\\{\\},]", " ");
        String[] strings = string.split("[ ]+");
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            String number = strings[i].strip();
            
            if(number.equals("")) {
                continue;
            }
            
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        int[] answer = new int[entries.size()];
        System.out.println(entries);
        
        for (int i = 0; i < entries.size(); i++) {
            answer[i] = Integer.parseInt(entries.get(i).getKey());        
        }
        
        return answer;
    }
}