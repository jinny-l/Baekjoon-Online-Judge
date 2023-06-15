class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            String tmp = strArr[i];
            if(i % 2 == 0) {
                answer[i] = tmp.toLowerCase();
            } else {
                answer[i] = tmp.toUpperCase();
            }
        }
        
        return answer;
    }
}