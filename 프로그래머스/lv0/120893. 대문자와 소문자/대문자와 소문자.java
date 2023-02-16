class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] string = my_string.toCharArray();
        for (char c : string) {
            if (c >= 65 && c <= 90) { // 대문자일 때
                answer += String.valueOf(c).toLowerCase();
            }
            if (c >= 97 && c <= 122) { // 소문자일 때
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}