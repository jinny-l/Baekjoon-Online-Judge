class Solution {
    boolean solution(String s) {
        int leftCount = 0;
        int rightCount = 0;
        
        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            }
            if (s.charAt(i) == ')') {
                rightCount++;
            }
            if (rightCount > leftCount) {
                return false;
            }
        }
        
        if (leftCount == rightCount) {
            return true;
        }
        
        return false;
    }
}