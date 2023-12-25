class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String color = board[h][w];
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};
        
        for(int i = 0; i < 4; i++) {
            int x = h + dx[i];
            int y = w + dy[i];
            
            if(x < 0 || y < 0 || x >= board[0].length || y >= board[0].length) {
                continue;
            }
            
            String compare = board[x][y];
            if(compare.equals(color)) {
                answer++;
            }
        }
        
        return answer;
    }
}