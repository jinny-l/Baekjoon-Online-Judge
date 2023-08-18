class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        String number = String.valueOf(x);
        for(int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        
        System.out.println(sum);
        
        return x % sum == 0;
    }
}