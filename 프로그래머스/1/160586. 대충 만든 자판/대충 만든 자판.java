class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int count = 0;
            int min = Integer.MAX_VALUE;
        
            for(int j = 0; j < target.length(); j++) {
                
                for(int k = 0; k < keymap.length; k++) {
                    min = Math.min(min, keymap[k].indexOf(target.charAt(j)));
                    System.out.println(target.charAt(j) + " " + keymap[k].indexOf(target.charAt(j)));
                    
                    if(min == -1) {
                        answer[i] = -1;
                        continue;
                    }
                    count += min;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}