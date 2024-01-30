import java.util.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            set.add(my_string.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        Iterator iterator = set.iterator();
        
        while(iterator.hasNext()) {
            sb.append(iterator.next());
        }
        
        return sb.toString();
    }
}