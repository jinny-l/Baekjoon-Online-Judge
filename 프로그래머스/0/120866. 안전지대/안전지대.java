class Solution {
    public int solution(int[][] board) {
        
        int[] dx = {0, 1, -1, 0, -1, 1, 1, -1};
        int[] dy = {1, 0, 0, -1, -1, 1, -1, 1};
        
        for(int i = 0; i < board.length; i++) {
            
            for(int j = 0; j < board[i].length; j++) {
                
                if(board[i][j] == 1) {
                    
                    for(int k = 0; k < dx.length; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                    
                        if(x < 0 || y < 0 || x >= board[i].length || y >= board.length || board[x][y] == 1) {
                            continue;
                        } else {
                            board[x][y] = 2;
                        }
                    }
                }
            }
        }
        
        int safe = 0;

        for (int[] array : board) {
            for (int value : array) {
                if (value == 0) safe++;
            }
        }
            
        return safe;
    }
}