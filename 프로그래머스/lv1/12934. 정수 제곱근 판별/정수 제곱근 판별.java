class Solution {
    public long solution(long n) {
        long sqrt = (int) Math.sqrt(n);        
        
        if(sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }
        
        return -1L;
    }
}