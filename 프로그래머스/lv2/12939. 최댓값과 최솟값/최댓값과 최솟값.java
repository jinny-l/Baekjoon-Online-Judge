class Solution {
    public String solution(String s) {
        String[] number = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < number.length; i++) {
            int tmp = Integer.parseInt(number[i]);
            min = Math.min(min, tmp);
            max = Math.max(max, tmp);
        }
        return min + " " + max;
    }
}