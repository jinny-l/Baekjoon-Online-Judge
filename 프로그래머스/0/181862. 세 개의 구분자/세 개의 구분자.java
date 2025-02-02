import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();
        
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        
        String[] arr = myStr.split(" ");
        
        for(String s :  arr) {
            if(!s.isEmpty()) {
                answer.add(s);
            }
        }
        
        if(answer.size() == 0) {
            return new String[]{"EMPTY"};
        }
        
        return answer.toArray(new String[0]);
    }
}