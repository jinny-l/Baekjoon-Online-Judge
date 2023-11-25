class Solution {
    public int solution(String s) {
        if(s.length() == 1) {
            return 1;
        }
        
        
        int answer = 0;
        
        int sameCount = 1;
        int diffCount = 0;
        char target = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++) {
            char cmp = s.charAt(i);
            
            if(cmp == target) {
                sameCount++;
            } else {
                diffCount++;
            }
            
            if(i + 1 == s.length()) {
                answer++;
                break;
            }
            
            if(sameCount == diffCount) {
                sameCount = 0;
                diffCount = 0;
                target = s.charAt(i + 1);
                answer++;
            }
        }
        
        return answer;
    }
}