class Solution {
    public String solution(String myString) {
        String[] alphas = myString.split("");
        
        for(int i = 0; i < alphas.length; i++) {
            if(alphas[i].compareTo("l") < 0) {
                alphas[i] = "l";
            }
        }
        
        return String.join("", alphas);
    }
}