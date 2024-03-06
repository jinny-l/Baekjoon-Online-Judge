class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        String stringAge = String.valueOf(age);
            
        for(int i = 0; i < stringAge.length(); i++) {
            int c = Character.getNumericValue(stringAge.charAt(i));
            
            sb.append((char) (c + 97));
        }
        
        return sb.toString();
    }
}