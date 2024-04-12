class Solution {
    public int[] solution(int n) {
        
        int[][] arr = new int[n][n];
        
        int x = -1;
        int y = 0;
        
        int number = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                
                if(i % 3 == 0) {
                    x++;
                }
                
                if(i % 3 == 1) {
                    y++;
                }
                
                if(i % 3 == 2) {
                    x--;
                    y--;
                }
                
                arr[x][y] = number++;
            }
        }
        
        int[] answer = new int[(n * (n + 1)) / 2];
        int index = 0;
        
        for(int[] val : arr) {
            for(int i = 0; i < val.length; i++) {
                if(val[i] != 0) {
                    answer[index++] = val[i];
                }
            }
        }
        
        return answer;
    }
}