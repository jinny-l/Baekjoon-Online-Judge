class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            String number = String.valueOf(i);
            int count = food[i];
            sb.append(number.repeat(count / 2));
        }
        
        answer = sb.toString() + "0" + sb.reverse();
        
        return answer;
    }
}