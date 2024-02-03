class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++) {
            String cmp = skill_trees[i];
            StringBuilder sb = new StringBuilder();
            
            for(int j = 0; j < cmp.length(); j++) {
                if(skill.contains(cmp.substring(j, j + 1))) {
                   sb.append(cmp.charAt(j)); 
                }
            }
            
            if(skill.substring(0, sb.length()).contains(sb.toString())) {
                answer++;
            }
        }
        
        return answer;
    }
}