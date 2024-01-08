import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        List<String> wantList = new ArrayList<>();
        for(int i = 0; i < want.length; i++) {
            for(int j = 0; j < number[i]; j++) {
                wantList.add(want[i]);
            }
        }
        
        int count = 0;
        for(int i = 0; i <= discount.length - 10; i++) {
            List<String> buyList = new ArrayList<>(wantList);
            
            for(int j = i; j < i + 10; j++) {
                if(buyList.contains(discount[j])) {
                    buyList.remove(discount[j]);
                }
            }
            
            if(buyList.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}