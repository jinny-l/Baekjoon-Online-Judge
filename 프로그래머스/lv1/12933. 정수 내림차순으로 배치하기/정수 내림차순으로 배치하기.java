import java.util.*;

class Solution {
    public long solution(long n) {
        char[] sorted = String.valueOf(n).toCharArray();
        Arrays.sort(sorted);
        
        StringBuilder sb = new StringBuilder();
        for(int i = sorted.length - 1; i >= 0; i--) {
            sb.append(sorted[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}