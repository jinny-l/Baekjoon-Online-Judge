// import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        
        int start = (total / num) - ((num - 1) / 2);
        
        for(int i = 0; i < num; i++) {
            result[i] = start++;
        }
        
        return result;
    }
}