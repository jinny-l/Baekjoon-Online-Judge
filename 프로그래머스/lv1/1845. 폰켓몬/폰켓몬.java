import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> pokemons = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            pokemons.put(num, pokemons.getOrDefault(num, 0) + 1);
        }
        
        if(pokemons.size() > nums.length / 2) {
            return nums.length / 2;
        }
        return pokemons.size();
    }
}