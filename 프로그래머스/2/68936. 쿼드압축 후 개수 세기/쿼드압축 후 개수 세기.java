class Solution {
    
    private int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        quad(0, 0, arr, arr.length);
        return answer;
    }
    
    private void quad(int x, int y, int[][] arr, int size) {
        if(allSame(x, y, arr, size)) {
            answer[arr[x][y]]++;
            return;
        }
        
        quad(x, y, arr, size / 2);
        quad(x + size / 2, y, arr, size / 2);
        quad(x, y + size / 2, arr, size / 2);
        quad(x + size / 2, y + size / 2, arr, size / 2);
    }
    
    private boolean allSame(int x, int y, int[][] arr, int size) {
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(arr[x][y] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}