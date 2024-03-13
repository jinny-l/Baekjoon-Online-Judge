import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        int index = -1;
        String word = "";
        
        for(int i = 0; i < str_list.length; i++) {
            String find = str_list[i];
            
            if(find.equals("l") || find.equals("r")) {
                index = i;
                word = find;
                break;
            }
        }
        
        if(index == -1) {
            return new String[]{};
        }
        
        if(word.equals("l")) {
            for(int i = 0; i < index; i++) {
                list.add(str_list[i]);
            }
        }
        
        if(word.equals("r")) {
            for(int i = index + 1; i < str_list.length; i++) {
                list.add(str_list[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
}