import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int length = score.length;
        while(length - m >= 0) {
            int price = score[length - m];
            length -= m;
            answer += price * m;
        }
        
        return answer;
    }
}