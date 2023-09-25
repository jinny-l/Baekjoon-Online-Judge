import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            String tmp = strings[i].charAt(n) + strings[i];
            list.add(tmp);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}