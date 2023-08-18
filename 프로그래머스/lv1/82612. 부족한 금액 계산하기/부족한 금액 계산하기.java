class Solution {
    public long solution(int price, int money, int count) {
        long cost = 0;
        
        for (int i = 1; i <= count; i++) {
            cost += i * price;
        }
        
        if (cost - money > 0) {
            return cost - money;
        }

        return 0;
    }
}