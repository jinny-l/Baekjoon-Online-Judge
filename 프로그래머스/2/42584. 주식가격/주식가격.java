class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length - 1; i++) {
            int price = prices[i];
            int second = 0;
            
            for(int j = i + 1; j < prices.length; j++) {
                second++;
                
                if(prices[j] < price) {
                    break;
                } 
                
            }
            answer[i] = second;
        }
        
        return answer;
    }
}