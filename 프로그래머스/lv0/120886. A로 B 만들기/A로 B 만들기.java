import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] a = before.split("");
        String[] b = after.split("");
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for(int i = 0; i < a.length; i++) {
            if(!a[i].equals(b[i])) {
                return 0;
            }
        }
        return 1;
    }
}