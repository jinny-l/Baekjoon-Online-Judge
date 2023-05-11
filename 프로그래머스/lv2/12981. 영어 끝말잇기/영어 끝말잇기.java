import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = {0, 0};
        char alpha = words[0].charAt(words[0].length() - 1);
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            char cmp = word.charAt(0);
            
            if (alpha != cmp || list.contains(word)) {
                result[0] = i % n + 1;
                result[1] = i / n + 1;
                break;
            }
            
            alpha = word.charAt(word.length() - 1);
            list.add(word);
        }
        return result;
    }
}