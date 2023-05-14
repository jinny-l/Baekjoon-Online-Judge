class Solution {
    
    int count = 0;
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int repeated = 0;
        String copy = s;
        while (!copy.equals("1")) {
            copy = toBinary(copy);
            repeated++;
        }
        
        answer[0] = repeated;
        answer[1] = count;
        
        return answer;
    }
    
    public String toBinary(String s) {
        String number = s.replace("0", "");
        int length = number.length();
        
        count += s.length() - number.length();
        
        return Integer.toBinaryString(length);
    }
}