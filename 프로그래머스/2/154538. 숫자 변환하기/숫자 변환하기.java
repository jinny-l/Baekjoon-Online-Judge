class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        
        if(x == y) {
            return 0;
        }
        
        for(int i = x; i <= y; i++) {
            // 변환이 불가능할 때
            if(i != x && dp[i] == 0) {
                continue;
            }
            
            // n을 더할 때
            if(i + n <= y) {
                dp[i + n] = dp[i + n] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
            
            // 2를 곱할 때
            if(i * 2 <= y) {
                dp[i * 2] = dp[i * 2] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            
            // 3을 곱할 때
            if(i * 3 <= y) {
                dp[i * 3] = dp[i * 3] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
        }    
        
        if(dp[y] == 0) {
            return -1;
        }
        
        return dp[y];
    }
}