class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
            
        int maxIdx = 1, minIdx = 0, profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[minIdx]) {
                minIdx = i;
                if (minIdx == prices.length-1){
                 maxIdx = minIdx;   
                }
                else if (maxIdx < minIdx) {
                    maxIdx = minIdx + 1;
                }
            }
            if (prices[i] > prices[maxIdx]) {
                maxIdx = i;
            }
            
            int diff = prices[maxIdx] - prices[minIdx];
            if (diff > profit) {
                profit = diff;
            }
        }
        return profit;
    }
    
}