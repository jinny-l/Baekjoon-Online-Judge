class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            int element = arr[i];
            
            if(element >= 50 && element % 2 == 0) {
                answer[i] = element / 2;
            
            } else if(element < 50 && element % 2 != 0) {
                answer[i] = element * 2;
                
            } else {
                answer[i] = arr[i];
            }
        }
        
        return answer;
    }
}