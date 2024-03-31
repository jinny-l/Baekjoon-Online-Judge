class Solution {
    public int solution(String num_str) {
        char[] arr = num_str.toCharArray();
        
        int answer = 0;
        
        for(char num : arr) {
            answer += Character.getNumericValue(num);
        }
        
        return answer;
    }
}