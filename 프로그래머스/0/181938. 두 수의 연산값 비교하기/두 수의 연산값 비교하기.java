class Solution {
    public int solution(int a, int b) {
        int val1 = 2 * a * b;
        int val2 = Integer.parseInt("" + a + b);
        
        return Math.max(val1, val2);
    }
}