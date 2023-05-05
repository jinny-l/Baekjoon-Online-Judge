class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        long previous = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = previous + x;
            previous = answer[i];
        }
        return answer;
    }
}