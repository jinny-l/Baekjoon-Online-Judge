class Solution {
    public int solution(int[] array) {
        int[] numbers = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            numbers[array[i]]++;
        }
        
        int max = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            max = Math.max(numbers[i], max);
        }
        
        int count = 0;
        int index = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == max) {
                count++;
                index = i;
            }
        }
        
        if(count > 1) {
            return -1;
        }
        return index;
    }
}