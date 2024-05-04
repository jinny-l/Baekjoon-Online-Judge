class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] numbers = s.split(" ");
        
        for(int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            
            if(!number.equals("Z")) {
                answer += Integer.parseInt(number);
            }
            
            if(number.equals("Z")) {
                answer -= Integer.parseInt(numbers[i - 1]);
            }
        }
        
        return answer;
    }
}