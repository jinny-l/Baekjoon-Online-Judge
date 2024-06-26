import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(index == indices.length) {
                sb.append(my_string.charAt(i));
            
            } else if(i == indices[index]) {
                index++;  
            
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}