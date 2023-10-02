import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        int answer = 0;
        
        List<Long> numbers = new ArrayList<>();
        
        for(int i = 0; i < t.length(); i++) {
            if(i + length > t.length()) {
                break;
            }
            
            long tmp = Long.parseLong(t.substring(i, i + length));
            numbers.add(tmp);
        }
        
        for(Long number : numbers) {
            if(number <= Long.parseLong(p)) {
                answer++;
            }
        }    
        
        return answer;
    }
}