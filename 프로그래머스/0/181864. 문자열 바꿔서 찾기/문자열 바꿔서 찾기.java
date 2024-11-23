class Solution {
    public int solution(String myString, String pat) {
        String myString1 = myString.replaceAll("A", "C");
        String myString2 = myString1.replaceAll("B", "A");
        String myString3 = myString2.replaceAll("C", "B");
        
        if(myString3.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}