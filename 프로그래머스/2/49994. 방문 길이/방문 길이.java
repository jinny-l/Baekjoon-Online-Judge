import java.util.*;

class Solution {
    public int solution(String dirs) {
        
        Set<String> set = new HashSet<>();
        
        int currentX = 0;
        int currentY = 0;
        
        for(int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);
            
            int previousX = currentX;
            int previousY = currentY;
            
            if(currentY != 5 && dir == 'U') {
                currentY++;
            } else if(currentY != -5 && dir == 'D') {
                currentY--;
            } else if(currentX != 5 && dir == 'R') {
                currentX++;
            } else if(currentX != -5 && dir == 'L') {
                currentX--;
            } else {
                continue;
            }
            
            set.add("" + currentX + currentY + previousX + previousY);
            set.add("" + previousX + previousY + currentX + currentY);
        }
       
        return set.size() / 2;
    }
}