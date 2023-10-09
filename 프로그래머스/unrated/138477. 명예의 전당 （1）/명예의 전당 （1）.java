import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<List<Integer>> scores = new ArrayList<>();
        
        List<Integer> top3 = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            top3.add(score[i]);
            top3.sort(Comparator.reverseOrder());
            
            List<Integer> top3Copy = new ArrayList<>(top3);
            scores.add(top3Copy.subList(0, Math.min(top3Copy.size(), k)));
        }
        
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            answer[i] = scores.get(i).get(scores.get(i).size() - 1);
        }
    
        return answer;
    }
}