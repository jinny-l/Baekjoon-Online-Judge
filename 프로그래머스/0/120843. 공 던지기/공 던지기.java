class Solution {
    public int solution(int[] numbers, int k) {
        int index = (k * 2 - 1) % numbers.length - 1;
        
        if(index == -1) {
            index = numbers.length - 1;
        }

        return numbers[index];
    }
}