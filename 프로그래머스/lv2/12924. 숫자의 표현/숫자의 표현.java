class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        
        int start = 1;
        while(start < n) {
            for (int i = start; i < n; i++) {
                sum += i;
                if (sum == n) {
                    answer++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
            sum = 0;
            start++;
        }
        System.out.println(start);
        return answer;
    }
}