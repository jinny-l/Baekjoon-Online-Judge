class Solution {
    public int[] solution(String myString) {
        String[] values = myString.split("x", -1);
        int[] answer = new int[values.length];
        
        for(int i = 0; i < values.length; i++) {
            answer[i] = values[i].length();
        }
        
        return answer;
    }
}