import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        
        char[] numbers = number.toCharArray();
        int index = 0;
        int length = number.length() - k;
        
        for(int i = 0; i < length; i++) {
            char max = '0';
            int leftLen = length - sb.length();
            
            for(int j = index; j <= number.length() - leftLen; j++) {
                if(numbers[j] > max) {
                    max = numbers[j];
                    index = j + 1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}