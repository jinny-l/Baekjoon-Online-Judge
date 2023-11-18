class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int num = 0;
        
        for(String mono : polynomial.split(" ")) {
            if(mono.contains("x")) {
                x += mono.equals("x") ? 1 : Integer.parseInt(mono.replace("x", ""));
            
            } else if(!mono.equals("+")) {
                num += Integer.parseInt(mono);
            }
        }
        
        String answer = "";
        
        // x가 0일때, 1일때, 숫자일 때
        if(x == 0) {
        } else if(x == 1) {
            answer += "x";
        } else {
            answer += x + "x";
        }
        
        // 숫자가 0일 때 아닐떄
        if(num == 0) {
            
        } else if (x == 0) {
            answer += num;
            
        } else {
            answer += " + " + num;
        }
        
        return answer;
    }
}