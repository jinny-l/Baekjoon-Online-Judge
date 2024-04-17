class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil(my_str.length() / (double) n)];
        
        int start = 0;
        
        for(int i = 0; i < answer.length; i++) {
            
            if(start + n > my_str.length()) {
                answer[i] = my_str.substring(start);
            
            } else {
                answer[i] = my_str.substring(start, start + n);
            }

            start += n;
        }
        
        return answer;
    }
}