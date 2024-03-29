class Solution {
    public int solution(String my_string) {
        char[] arr = my_string.toCharArray();
        
        int answer = 0;
        for(int i = 0; i < arr.length; i++) {
            if(Character.isDigit(arr[i])) {
                answer += Character.getNumericValue(arr[i]);
            }
        }
        
        return answer;
    }
}