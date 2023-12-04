class Solution {
    public int[] solution(String[] wallpaper) {
        int rowMin = Integer.MAX_VALUE;
        int colMin = Integer.MAX_VALUE;
        
        int rowMax = Integer.MIN_VALUE;
        int colMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            String files = wallpaper[i];
            
            for(int j = 0; j < files.length(); j++) {
                char file = files.charAt(j);
                
                if(file == '#') {
                    rowMin = Math.min(rowMin, i);
                    colMin = Math.min(colMin, j);
                    
                    rowMax = Math.max(rowMax, i);
                    colMax = Math.max(colMax, j);
                }
            }
        }
        
        return new int[]{rowMin, colMin, rowMax + 1, colMax + 1};
    }
}