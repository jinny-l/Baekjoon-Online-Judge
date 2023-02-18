class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int val : array) {
            if (val > height) {
                answer++;
            }
        }
        
        return answer;
    }
}