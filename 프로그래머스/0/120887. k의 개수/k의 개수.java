import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int index = i; index <= j; index++) {
            char[] numbers = String.valueOf(index).toCharArray();
            
            for(int x = 0; x < numbers.length; x++) {
                if(Character.getNumericValue(numbers[x]) == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}