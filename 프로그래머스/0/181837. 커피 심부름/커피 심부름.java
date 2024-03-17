class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i < order.length; i++) {
            String menu = order[i];
            
            if(menu.equals("anything")) {
                answer += 4500;
            }
            
            if(menu.contains("americano")) {
                answer += 4500;
            }
            
            if(menu.contains("cafelatte")) {
                answer += 5000;
            }
        }
        
        return answer;
    }
}