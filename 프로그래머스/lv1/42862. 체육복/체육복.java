import java.util.*;

class Solution {
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생의 체육복 도난 상황 체크 
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -999;
                    reserve[j] = -999;
                    answer++;
                    break;
                }
            }
        }
        
        // 여벌 체육복 빌려주기
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
            
                if(lost[i] - 1 == reserve[j]) {
                answer++;
                reserve[j] = -999;
                break;
                }
            
                if(lost[i] + 1 == reserve[j]) {
                answer++;
                reserve[j] = -999;
                break;
                }
            }
            
        }
        
        return answer;
        
    }
}