import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int hIndex = 0;
        for(int i = 0; i < citations.length; i++) {
            int bookCnt = citations.length - i;
            
            if(citations[i] >= bookCnt) {
                hIndex = bookCnt;
                break;
            }
        }
        
        return hIndex;
    }
}