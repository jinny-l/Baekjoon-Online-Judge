class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        String newString = myString.toLowerCase();
        
        for(int i = 0; i < newString.length(); i++) {
            char tmp = newString.charAt(i);
            
            if(tmp == 'a') {
                sb.append("A");
            } else {
                sb.append(tmp);
            }
        }
        
        return sb.toString();
    }
}