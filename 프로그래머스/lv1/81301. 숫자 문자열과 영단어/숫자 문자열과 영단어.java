import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        
        Map<String, String> number = new HashMap<String, String>() {
            {
                put("zero", "0");
                put("one", "1");
                put("two", "2");
                put("three", "3");
                put("four", "4");
                put("five", "5");
                put("six", "6");
                put("seven", "7");
                put("eight", "8");
                put("nine", "9");
            }
        };

        for (String key : number.keySet()) {
            s = s.replace(key, number.get(key));
        }
        return Integer.parseInt(s);
        
    }
}