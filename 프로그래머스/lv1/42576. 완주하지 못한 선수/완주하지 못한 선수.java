import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participants = new HashMap<>();
        Map<String, Integer> completions = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            String tmp = participant[i];
            participants.put(tmp, participants.getOrDefault(tmp, 0) + 1);
        }
        
        for(int i = 0; i < completion.length; i++) {
            String tmp = completion[i];
            completions.put(tmp, completions.getOrDefault(tmp, 0) + 1);
        }
        
        for (int i = 0; i < participant.length; i++) {
            String person = participant[i];
            int number = participants.get(person);
            
            if(!completions.containsKey(person) || completions.get(person) != number) {
                return person;
            }
        }
        
        
        return null;
    }
}