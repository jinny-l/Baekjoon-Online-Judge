class Solution {
    public boolean solution(String s) {
        char[] checkInteger = s.toCharArray();
        
        for (char c : checkInteger) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return s.length() == 4 || s.length() ==6;
    }
}