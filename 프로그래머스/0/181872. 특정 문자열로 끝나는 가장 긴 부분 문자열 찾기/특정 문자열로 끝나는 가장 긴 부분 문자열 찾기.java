class Solution {
    public String solution(String myString, String pat) {
        
        int index = -1;
        
        for(int i = myString.length() - 1; i >= pat.length() - 1; i--) {
            String findString = myString.substring(i - pat.length() + 1, i + 1);
            
            if(findString.equals(pat)) {
                index = i + 1;
                break;
            }   
        }
        
        return myString.substring(0, index);
    }
}