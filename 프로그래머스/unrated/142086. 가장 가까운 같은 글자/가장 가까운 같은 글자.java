import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> alphabet = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character tmp = s.charAt(i);
            if (alphabet.get(tmp) == null) {
                answer[i] = -1;
                alphabet.put(tmp, i);
                continue;
            }
            answer[i] = i - alphabet.get(tmp);
            alphabet.put(tmp, i);
        }
        return answer;
    }
}