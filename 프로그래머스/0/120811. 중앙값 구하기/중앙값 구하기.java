import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int index = (int) Math.ceil(array.length / 2);
        
        return array[index];
    }
}