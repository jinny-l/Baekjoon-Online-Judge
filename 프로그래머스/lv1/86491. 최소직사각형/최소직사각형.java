class Solution {
    public int solution(int[][] sizes) {        
        
        int width = 0;
        int height = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            int x = sizes[i][0];
            int y = sizes[i][1];
            
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            
            sizes[i][0] = max;
            sizes[i][1] = min;
            
            width = Math.max(sizes[i][0], width);
            height = Math.max(sizes[i][1], height);
        }
        
        return width * height;
    }
}