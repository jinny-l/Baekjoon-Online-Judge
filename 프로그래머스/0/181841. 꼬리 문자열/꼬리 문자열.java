class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        
        for(String word : str_list) {
            if(!word.contains(ex)) {
                sb.append(word);
            }
        }
        
        return sb.toString();
    }
}