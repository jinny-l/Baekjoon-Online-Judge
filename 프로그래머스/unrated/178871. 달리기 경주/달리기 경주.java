import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranks = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            ranks.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            String calling = callings[i];
            int currentRank = ranks.get(calling);
            
            String previousPlayer = players[currentRank - 1];
            
            players[currentRank - 1] = calling;
            players[currentRank] = previousPlayer;
            
            ranks.put(calling, currentRank - 1);
            ranks.put(previousPlayer, currentRank);
        }
        
        return players;
    }
}