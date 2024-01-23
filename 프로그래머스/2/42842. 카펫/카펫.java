class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 1; i <= sum; i++) {
            int column = i;
            int row = sum / i;
            
            if(column > row) {
                break;
            }
            
            if((row - 2) * (column - 2) == yellow) {
                answer[0] = row;
                answer[1] = column;
                break;
            }
            
        }
        
        return answer;
    }
}