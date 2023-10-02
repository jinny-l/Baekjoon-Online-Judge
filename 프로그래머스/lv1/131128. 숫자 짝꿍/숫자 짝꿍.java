class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] xCounts = new int[10];
        int[] yCounts = new int[10];
        
        for (char c : X.toCharArray()) {
            xCounts[Character.getNumericValue(c)]++;
        }

        for (char c : Y.toCharArray()) {
            yCounts[Character.getNumericValue(c)]++;
        }
        
        for(char i = '9'; i >= '0'; i--) {
            int xCount = xCounts[Character.getNumericValue(i)];
            int yCount = yCounts[Character.getNumericValue(i)];
            
            if(xCount == 0 || yCount == 0) {
                continue;
            }
            
            int minCount = Math.min(xCount, yCount);
           
            for(int j = 0; j < minCount; j++) {
                sb.append(i);
            }
            
            //sb.append(String.valueOf(i).repeat(minCount));
        }
        
        if(sb.length() == 0) {
            return "-1";
        }
        
        if(sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}