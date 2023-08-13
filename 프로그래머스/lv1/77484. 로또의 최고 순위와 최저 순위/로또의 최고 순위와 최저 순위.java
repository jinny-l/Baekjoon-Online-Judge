import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Set<Integer> lottoNumbers = new HashSet<>();
        
        int zeroCount = 0;
        for(int i = 0; i < lottos.length; i++) {
            int num = lottos[i];
            
            if (num == 0) {
                zeroCount++;
            } else {
                lottoNumbers.add(num);
            }
        }
        
        int sameCount = 0;
        for(int i = 0; i < lottos.length; i++) {
            int winNum = win_nums[i];
            
            if (lottoNumbers.contains(winNum)) {
                sameCount++;
            }
        }
        
        if ((sameCount + zeroCount) == 0 || (sameCount + zeroCount) == 1) {
            answer[0] = 6;
        } else {
            answer[0] = 7 - (sameCount + zeroCount);
        }
        
        
        if (lottoNumbers.size() == 0 || sameCount == 0) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - sameCount;
        }
        
        return answer;
    }
}