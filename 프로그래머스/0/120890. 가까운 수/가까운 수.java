class Solution {
    public int solution(int[] array, int n) {
        int index = 0;
        int diff = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++) {
            int tmp = Math.abs(array[i] - n);
            
            if(tmp < diff) {
                diff = tmp;
                index = i;
            }
            
            if(tmp == diff) {
                diff = tmp;
                if(array[i] < array[index]) {
                    index = i;
                }
            }
        }
        
        return array[index];
    }
}