class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[][] map = new String[n][n];
        
        for(int i = 0; i < n; i++) {
            String firstMap = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            String secondMap = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            
            for (int j = 0; j < n; j++) {
                    if (firstMap.charAt(j) == '1' || secondMap.charAt(j) == '1') {
                        map[i][j] = "#";
                    } else {
                        map[i][j] = " ";
                    }
                }
        }
        
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < n; j++) {
                sb.append(map[i][j]);
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}