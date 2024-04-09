class Solution {
    
    private int[] answer = new int[]{0, Integer.MAX_VALUE - 1};
    
    public int[] solution(int[] sequence, int k) {
        
        int left = 0;
        int right = 1;
        int sum = sequence[0];
        
        while(left < right) {
            if(sum == k) {
                compareAnswer(left, right);
                sum -= sequence[left++];
                
            } else if(sum > k) {
                sum -= sequence[left++];
                
            } else if(sum < k && right < sequence.length) {
                sum += sequence[right++];
            
            } else if(right == sequence.length) { // left가 최대인 상황에 k보다 작고 right가 더 커질 수 없으면 중단
                break;
            }
        }
        return answer;
    }
    
    private void compareAnswer(int left, int right) {
        if(right - left < answer[1] - answer[0] + 1) {
            answer[0] = left;
            answer[1] = right - 1;
       }
    }
}