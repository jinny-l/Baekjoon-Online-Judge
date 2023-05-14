class Solution {
    public int solution(int n) {
        int count = Integer.bitCount(n);
        int answer = 0;
        
        for (int i = n + 1; i < 1000000; i++) {
            if (Integer.bitCount(i) == count) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}