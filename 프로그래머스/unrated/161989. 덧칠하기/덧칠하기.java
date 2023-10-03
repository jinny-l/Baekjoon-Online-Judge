class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int tmp = section[0];
        int paint = tmp + m - 1;
        
        for(int i = 1; i < section.length; i++) {
            int cmp = section[i];
            
            if(cmp > paint) {
                answer++;
                tmp = cmp;
                paint = cmp + m - 1;
            }
        }
        
        return answer;
    }
}