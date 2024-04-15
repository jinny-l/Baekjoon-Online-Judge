class Solution {
    public int solution(int [][]board) {
        
        if(board.length == 1) {
            for(int i = 0; i < board[0].length; i++) {
                if(board[0][i] == 1) {
                    return 1;
                }
            }
            
            return 0;
        }
        
        if(board[0].length == 1) {
            for(int i = 0; i < board.length; i++) {
                if(board[i][0] == 1) {
                    return 1;
                }
            }
            return 0;
        }
        
        int maxLen = 0;
        
        for(int i = 1; i < board.length; i++) {
            for(int j = 1; j < board[0].length; j++) {
                if(board[i][j] != 0) {
                    int up = board[i - 1][j];
                    int left = board[i][j - 1];
                    int upLeft = board[i - 1][j - 1];
                    
                    board[i][j] = Math.min(up, Math.min(left, upLeft)) + 1;
                    maxLen = Math.max(maxLen, board[i][j]);
                }
            }
        }
        
        return maxLen * maxLen;
    }
}