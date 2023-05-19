class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            if (word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")) {
                continue;
            }
            
            for (int j = 0; j < words.length; j++) {
                word = word.replace(words[j], " ");
            }
            
            word = word.replace(" ", "");
            
            if (word.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}