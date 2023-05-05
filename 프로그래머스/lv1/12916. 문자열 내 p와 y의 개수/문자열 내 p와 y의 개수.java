class Solution {
    boolean solution(String s) {
        
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 80 || s.charAt(i) == 112) {
                p++;
            } else if (s.charAt(i) == 89 || s.charAt(i) == 121) {
                y++;
            }
        }
        
        if (p == y) {
            return true;
        } else if (p != y) {
            return false;
        } else if (p == 0 && y == 0) {
            return true;
        }
        return false;
    }
    
}