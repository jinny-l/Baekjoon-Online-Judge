class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        for(int i = 0; i < keyinput.length; i++) {
            String input = keyinput[i];
            
            if(y != board[1] / 2 && input.equals("up")) {
                y++;
            }
            
            if(y != -1 * board[1] / 2 && input.equals("down")) {
                y--;
            }
            
            if(x != board[0] / 2 && input.equals("right")) {
                x++;
            }
            
            if(x != -1 * board[0] / 2 && input.equals("left")) {
                x--;
            }
        }
        
        return new int[]{x, y};
    }
}