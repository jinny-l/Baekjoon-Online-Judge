import java.util.*;

class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int) (end - begin + 1)];
        
        int index = 0;
        
        for(long i = begin; i <= end; i++) {
            answer[index++] = findLargestDivisor(i);
        }
        
        return answer;
    }
    
    private int findLargestDivisor(long n) {
        if(n == 1L) {
            return 0;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int divisor = (int) n / i;
                
                if(divisor > 10_000_000) {
                    list.add(divisor);
                    continue;
                
                } else {
                    return divisor;
                }
            }
        }
        
        if(!list.isEmpty()) {
            return (int) n / list.get(list.size() - 1);
        }
        
        return 1;
    }
}