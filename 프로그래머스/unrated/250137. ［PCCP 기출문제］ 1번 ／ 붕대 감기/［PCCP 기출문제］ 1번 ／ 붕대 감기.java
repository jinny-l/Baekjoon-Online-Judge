class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int healthUse = 0;
        int phase = 0;
        
        for(int i = 0; i < attacks.length; i++) {
            int attackTime = attacks[i][0];
            int attackDamage = attacks[i][1];
            
            for(int j = phase; j < attackTime; j++) {
                phase++;
                
                if(attackTime == phase) {
                    currentHealth -= attackDamage;
                    healthUse = 0;
                } else {            
                    healthUse++;
        
                    if(healthUse == bandage[0]) {
                        currentHealth += bandage[2];
                        healthUse = 0;
                    }
                    currentHealth += bandage[1];
                }
                
                if(currentHealth > health) {
                    currentHealth = health;
                }
         
                if(currentHealth <= 0) {
                    return -1;
                }
            }
        }
        return currentHealth;
    }
}