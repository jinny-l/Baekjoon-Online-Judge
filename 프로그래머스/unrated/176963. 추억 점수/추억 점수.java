import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> scores = new HashMap<>();
        
        // 점수 입력
        for(int i = 0; i < name.length; i++) {
            String key = name[i];
            int value = yearning[i];
            scores.put(key, value);
        }
        
        // 점수 계산
        int sum = 0;
        for(int i = 0; i < photo.length; i++) {
            String[] tmp = photo[i];
            for(int j = 0; j < tmp.length; j++) {
                String person = tmp[j];
                int score = scores.getOrDefault(person, 0);
                sum += score;
            }
            answer[i] = sum;
            sum = 0;
        }
        
        return answer;
    }
}