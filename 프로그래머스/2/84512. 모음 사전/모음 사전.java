import java.util.*;

class Solution {
    
    private final String[] alphabets = new String[]{"A", "E", "I", "O", "U"};
    private final List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        combination("");
        
        int answer = 0;
        
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }        
        
        return answer;
    }
    
    private void combination(String word) {
        if(word.length() > 5) {
            return;
        }
        
        list.add(word);
        
        for(int i = 0; i < alphabets.length; i++) {
            // 여기서 add했을 때는 안됐음;;
            combination(word + alphabets[i]);
        }
    }
}