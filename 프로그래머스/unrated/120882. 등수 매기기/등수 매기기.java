import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> average = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
            int averageScore = score[i][0] + score[i][1];
            average.add(averageScore);
        }
        average.sort(Comparator.reverseOrder());
        
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            answer[i] = average.indexOf(score[i][0] + score[i][1]) + 1;
        }
        
        return answer;
    }
}