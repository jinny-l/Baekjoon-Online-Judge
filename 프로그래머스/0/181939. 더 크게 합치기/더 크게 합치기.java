class Solution {
    public int solution(int a, int b) {
        int num1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int num2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        
        if(num1 > num2) {
            return num1;
        }
        return num2;
    }
}